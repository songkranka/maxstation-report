package report.api.controller;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.ReportSummaryOilBalance.CollectionInputToReport;
import report.api.models.ReportSummaryOilBalance.RequestGetDataModel;
import report.api.models.ReportSummaryOilBalance.ResponseTankModelForPDF;
import report.api.services.ReportSummaryOilBalanceService;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.*;

@RestController()
@RequestMapping("/ReportSummaryOilBalance/")
public class ReportSummaryOilBalanceController extends BaseController {
    public ReportSummaryOilBalanceController(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    @GetMapping(value = "hello")
    public String helloGet() {
        return "Hello ReportSummaryOilBalance";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "helloPost")
    public  String helloPost()
    {
        return "Hello POST";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "GetReportSummaryOilBalance")
    public void GetReportSummaryOilBalance(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReportSummaryOilBalanceService service = new ReportSummaryOilBalanceService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReport(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

}
