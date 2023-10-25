package report.api.controller;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import net.sf.jasperreports.engine.data.JsonDataSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.ReceivePay.CollectionInputToReport;
import report.api.models.ReceivePay.FinReceiveHd;
import report.api.models.ReceivePay.RequestGetDataModel;
import report.api.models.ReceivePay.ResponseReceivePay;
import report.api.services.ReceivePayService;
import report.api.services.ReportSummaryOilBalanceService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/ReceivePay/")
public class ReceivePayController extends BaseController {

    public ReceivePayController(Environment environment) {
        super(environment);
    }

    @GetMapping(value = "UrlApi")
    public String UrlApi() {
        ReceivePayService service = new ReceivePayService(super.env);
        return service.GetUrlApi();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintReceivePay")
    public void PrintReceivePay(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReceivePayService service = new ReceivePayService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReport(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
