package report.api.controller;

import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Meter.RequestGetDataModel;
import report.api.services.MeterService;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Meter/")
public class MeterController extends  BaseController
{
    public MeterController(Environment environment) {
        super(environment);
    }


    @CrossOrigin
    @PostMapping(value = "PrintMeterRepair")
    public void PrintMeterRepair(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        MeterService service = new MeterService(super.env);
        JasperExportManager.exportReportToPdfStream(service.GenMeterRepair(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin
    @PostMapping(value = "PrintMeterTest")
    public void PrintMeterTest(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        MeterService service = new MeterService(super.env);
        JasperExportManager.exportReportToPdfStream(service.GenMeterTest(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
