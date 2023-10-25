package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Goverment.RequestDataModel;
import report.api.services.GovermentService;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Goverment/")
public class GovermentController extends BaseController {

    public GovermentController(Environment environment) {
        super(environment);
    }

    @GetMapping(value = "UrlApi")
    public String UrlApi() {
        GovermentService service = new GovermentService(super.env);
        return service.GetUrlApi();
    }




    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov01")
    public void PrintGov01(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov01(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov03")
    public void PrintGOV03(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov03(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov04")
    public void PrintGov04(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov04(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @PostMapping(value = "GOV02")
//    public void PrintGov02(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {
//
//        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
//        response.setContentType("application/pdf; charset=UTF-8");
//
//        GovermentService service = new GovermentService(super.env);
//        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov02(dataModel), byteArr);
//
//        response.setContentLength(byteArr.size());
//        ServletOutputStream outPut = response.getOutputStream();
//        byteArr.writeTo(outPut);
//        outPut.flush();
//    }

//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @PostMapping(value = "Gov04")
//    public void PrintGov04(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {
//
//        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
//        response.setContentType("application/pdf; charset=UTF-8");
//
//        GovermentService service = new GovermentService(super.env);
//        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov04(dataModel), byteArr);
//
//        response.setContentLength(byteArr.size());
//        ServletOutputStream outPut = response.getOutputStream();
//        byteArr.writeTo(outPut);
//        outPut.flush();
//    }



    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov05")
    public void PrintGov05(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov05(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov06")
    public void PrintGov06(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov06(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov07")
    public void PrintGov07(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov07(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov08")
    public void PrintGov08(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {
        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov08(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov09")
    public void PrintGov09(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov09(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Gov11")
    public void PrintGov11(HttpServletResponse response, @RequestBody RequestDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        GovermentService service = new GovermentService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportGov11(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }



}
