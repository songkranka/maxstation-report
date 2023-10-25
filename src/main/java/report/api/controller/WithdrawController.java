package report.api.controller;

import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Withdraw.RequestGetDataModel;
import report.api.services.WithdrawService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Withdraw/")
public class WithdrawController extends  BaseController {

    public WithdrawController(Environment environment) {
        super(environment);
    }


    @CrossOrigin
    @PostMapping(value = "PrintPdf")
    public void PrintPdf(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        WithdrawService service = new WithdrawService(super.env);
        JasperExportManager.exportReportToPdfStream(service.GenDocument(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

}
