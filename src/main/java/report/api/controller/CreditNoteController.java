package report.api.controller;

import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.CreditNote.RequestDataModel;
import report.api.services.CreditNoteService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/CreditNote/")
public class CreditNoteController  extends BaseController {
    public CreditNoteController(Environment environment) {
        super(environment);
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintPdf")
    public void PrintPdf(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        CreditNoteService service = new CreditNoteService(super.env);
        JasperExportManager.exportReportToPdfStream(service.GenReport(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }
}
