package report.api.controller;

import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Billing.RequestGetDataModel;
import report.api.services.BillingService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Billing/")
public class BillingController extends BaseController{
    public BillingController(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintPdf")
    public void PrintPdf(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        BillingService service = new BillingService(super.env);
        JasperExportManager.exportReportToPdfStream(service.GenReportBilling(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }
}
