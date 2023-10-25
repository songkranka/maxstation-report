package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Customer.RequestDataModel;
import report.api.services.CustomerService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Customer/")
public class CustomerController extends BaseController {
    public CustomerController(Environment environment) {
        super(environment);
    }

    //รายงานยอดค้างรายตัว ตามใบกำกับภาษี
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Debtor02")
    public void PrintDebtor02(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        CustomerService service = new CustomerService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenDebtor02(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
