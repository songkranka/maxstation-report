package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Sales.RequestDataModel;
import report.api.services.SalesService;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Sales/")
public class SalesController  extends BaseController   {
    public SalesController(Environment environment) {
        super(environment);
    }


    //รายงานสมุดรายวัน (สรุปยอดรวม)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Sale02")
    public void PrintSale02(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        SalesService service = new SalesService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenSale02(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    //รายงานการขายเชื่อ แยกตามลูกค้า
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Sale03")
    public void PrintSale03(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        SalesService service = new SalesService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenSale03(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    //รายงานการขายเชื่อ แยกตามลูกค้า
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Sale04")
    public void PrintSale04(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        SalesService service = new SalesService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenSale04(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    //รายงานการขายสินค้า แยกตามลูกค้า
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Sale06")
    public void PrintSale06(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        SalesService service = new SalesService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenSale06(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

}
