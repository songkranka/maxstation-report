package report.api.controller;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.VatSale.CollectionInputToReport;
import report.api.models.VatSale.RequestGetDataModel;
import report.api.models.VatSale.VatSale;
import report.api.services.VatSaleService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/VatSale/")
public class VatSaleController extends BaseController{

    public VatSaleController(Environment environment) {
        super(environment);
    }

    @GetMapping(value = "UrlApi")
    public String UrlApi() {
        VatSaleService service = new VatSaleService(super.env);
        return service.GetUrlApi();
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "PrintPdf")
    public void PrintPdf(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(GenReport(dataModel), byteArr);

        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    private JasperPrint GenReport(RequestGetDataModel dataModel) throws Exception {
        try{
            VatSaleService vatsaleService = new VatSaleService(super.env);
            VatSale vatSale = vatsaleService.GetData(dataModel);

            String jrxml = "/reports/VatSale/VatSale.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", dataModel.BrnCode);

            //detail
            CollectionInputToReport collectionInputToReport = new CollectionInputToReport();
            collectionInputToReport.setVatSale(vatSale);
//            collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));


            //---------------------------------------//
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params ,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }



}
