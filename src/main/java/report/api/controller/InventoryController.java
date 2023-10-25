package report.api.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.Inventory.RequestGetDataModel;
import report.api.services.InventoryService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

@RestController()
@RequestMapping("/Inventory/")
public class InventoryController extends BaseController {
    public InventoryController(Environment environment) {
        super(environment);
    }



    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintWithdraw")
    public void PrintWithdraw(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenWithdraw(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintReceiveProd")
    public void PrintReceiveProd(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReceiveProd(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintReturnSup")
    public void PrintReturnSup(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReturnSup(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintReturnOil")
    public void PrintReturnOil(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReturnOil(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintTransferIn")
    public void PrintTransferIn(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenTransferIn(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintTransferOut")
    public void PrintTransferOut(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenTransferOut(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintTransferCompare")
    public void PrintTransferCompare(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenTransferCompare(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintTransferNotIn")
    public void PrintTransferNotIn(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenTransferNotIn(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintAdjust")
    public void PrintAdjust(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        InventoryService service = new InventoryService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenAdjust(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
