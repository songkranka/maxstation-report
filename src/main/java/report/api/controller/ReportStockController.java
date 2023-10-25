package report.api.controller;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import report.api.models.ReportStock.CollectionInputToReport;
import report.api.models.ReportStock.StockRequest;
import report.api.models.ReportStock.StockResponse;
import report.api.services.ReportStockService;
/*
import report.api.models.ReportSummaryOilBalance.CollectionInputToReport;
import report.api.models.ReportSummaryOilBalance.ResponseTankModelForPDF;
 */
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.*;

@RestController()
@RequestMapping("/ReportStock/")
public class ReportStockController extends BaseController {
    public ReportStockController(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    @GetMapping("urlapi")
    public String getUrlApi() {
        ReportStockService service = new ReportStockService(super.env);
        return ">> "+ service.GetUrlApi();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "GetReportStock")
    public void GetReportStockPDF(HttpServletResponse response, @RequestBody StockRequest dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReportStockService service = new ReportStockService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenStockDaily(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "GetReportStockMonthly")
    public void GetReportStockMonthlyPDF(HttpServletResponse response, @RequestBody StockRequest dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReportStockService service = new ReportStockService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenStockMonthly(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }


}
