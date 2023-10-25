package report.api.controller;

import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.ReportSummarySale.RequestGetDataModel;
import report.api.services.ReportSummarySaleService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/ReportSummarySale/")
public class ReportSummarySaleController extends BaseController {

    public ReportSummarySaleController(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    @CrossOrigin
    @PostMapping(value = "GetReportSummarySale")
    public void GetReportSummarySale(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReportSummarySaleService service = new ReportSummarySaleService(super.env);
        JasperExportManager.exportReportToPdfStream(service.GenReport(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
