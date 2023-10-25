package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Finance.RequestDataModel;
import report.api.services.FinanceService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Finance/")
public class FinanceController extends  BaseController {

    public FinanceController(Environment environment) {
        super(environment);
    }

    //รายงานทะเบียนรับรวม
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Fin03")
    public void PrintFin03(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        FinanceService service = new FinanceService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenFin03(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    //รายงานรายละเอียด รายได้ ค่าเช่า ภาษีโรงเรือน น้ำ ไฟ
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Fin08")
    public void PrintFin08(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        FinanceService service = new FinanceService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenFin08(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
