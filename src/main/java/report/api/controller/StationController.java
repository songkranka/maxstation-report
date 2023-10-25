package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Station.RequestDataModel;
import report.api.services.StationService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Station/")
public class StationController extends BaseController  {


    public StationController(Environment environment) {
        super(environment);
    }


//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @PostMapping(value = "CashierDiff")
//    public void PrintReportCashierDiff(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {
//
//        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
//        response.setContentType("application/pdf; charset=UTF-8");
//
//        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(GenReportCashierDiff(dataModel), byteArr);
//
//        response.setContentLength(byteArr.size());
//        ServletOutputStream outPut = response.getOutputStream();
//        byteArr.writeTo(outPut);
//        outPut.flush();
//    }

    //รายงานสรุปเงินขาด/เกิน แคชเชียร์
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "ST312")
    public void PrintST312(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        StationService service = new StationService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportST312(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    //รายงานขายประจำวัน
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "ST313")
    public void PrintST313(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        StationService service = new StationService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportST313(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    //รายงานยอดขาดเกินน้ำมันใสที่สถานีบริการ
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "ST315")
    public void PrintST315(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        StationService service = new StationService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportST315(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    //รายงานยอดขาดเกินน้ำมันใสที่สถานีบริการ
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "ST316")
    public void PrintST316(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        StationService service = new StationService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportST316(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    //รายงานยอดขายแยกตามกะ
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "ST317")
    public void PrintST317(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        StationService service = new StationService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportST317(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }



}
