package report.api.services;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReportStock.CollectionInputToReport;
import report.api.models.ReportStock.StockRequest;
import report.api.models.ReportStock.StockResponse;
import report.api.repository.StockRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportStockService extends BaseService {
    public ReportStockService(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    public String  GetUrlApi(){
        return super.config.getUrlApi();
    }

//    public StockResponse GetData(StockRequest requestGetDataModel) {
//        try {
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            String url = super.config.getUrlApi() + "/api/ReportStock/GetReportStockPDF";
//
//            HttpEntity<StockRequest> request = new HttpEntity<>(requestGetDataModel, headers);
//            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
//
//            Gson gson = new Gson();
//            StockResponse responseModelForPDF = gson.fromJson(response.getBody(), StockResponse.class);
//
//            return responseModelForPDF;
//        } catch (Exception ex) {
//            StockResponse responseModelForPDF = new StockResponse();
//            return responseModelForPDF;
//        }
//    }

    public JasperPrint GenStockDaily(StockRequest request) throws Exception {
        try{
//            ReportStockService reportStockService = new ReportStockService(super.env);
//            StockResponse responseStockModelForPDF = reportStockService.GetData(dataModel);
            StockRepository repo = new StockRepository(super.env);
            StockResponse responseData = repo.GetStockDaily(request);

            //params
            final InputStream stream = this.getClass().getResourceAsStream("/reports/ReportStock/ReportStock_v.jrxml");
            JasperReport report = JasperCompileManager.compileReport(stream);
            Map<String, Object> params = new HashMap<>();

            params.put("brnCode", responseData.getBrnCode());
            params.put("brnName", responseData.getBrnName());
            params.put("compName", responseData.getCompName());
            params.put("compImage", responseData.getCompImage());
            params.put("docDate", responseData.getDocDate());

            //detail
            CollectionInputToReport collectionInputToReport = new CollectionInputToReport();
            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(responseData.getStocks());
            collectionInputToReport.setStockDataSource(source);

            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    public JasperPrint GenStockMonthly(StockRequest request) throws Exception {
        try{
//            ReportStockService reportStockService = new ReportStockService(super.env);
//            StockResponse responseStockModelForPDF = reportStockService.GetData(dataModel);
            StockRepository repo = new StockRepository(super.env);
            StockResponse responseData = repo.GetStockMonthly(request);

            //params
            final InputStream stream = this.getClass().getResourceAsStream("/reports/ReportStock/StockMonthly_v.jrxml");
            JasperReport report = JasperCompileManager.compileReport(stream);
            Map<String, Object> params = new HashMap<>();

            params.put("brnCode", responseData.getBrnCode());
            params.put("brnName", responseData.getBrnName());
            params.put("compName", responseData.getCompName());
            params.put("compImage", responseData.getCompImage());
            params.put("dateFrom", responseData.getDateFrom());
            params.put("dateTo", responseData.getDateTo());

            //detail
            CollectionInputToReport collectionInputToReport = new CollectionInputToReport();
            JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(responseData.getStocks());
            collectionInputToReport.setStockDataSource(source);

            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
