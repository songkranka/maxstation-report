package report.api.services;

import com.google.gson.Gson;
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
import report.api.models.ReportSummaryOilBalance.ResponseTankModelForPDF;
import report.api.models.ReportSummarySale.CollectionInputToReport;
import report.api.models.ReportSummarySale.RequestGetDataModel;
import report.api.models.ReportSummarySale.ResponseSummarySaleForPDF;
import report.api.repository.SummarySaleRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportSummarySaleService extends BaseService {

    public ReportSummarySaleService(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }


    public JasperPrint GenReport(RequestGetDataModel dataModel) throws Exception {
        try{
            SummarySaleRepository repo = new SummarySaleRepository(super.env);
            ResponseSummarySaleForPDF response = repo.GetData(dataModel);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/ReportSummarySale/ReportSummarySale.jrxml");
            final InputStream crStream = this.getClass().getResourceAsStream("/reports/ReportSummarySale/CrItem.jrxml");
            final InputStream drStream = this.getClass().getResourceAsStream("/reports/ReportSummarySale/DrItem.jrxml");
            final InputStream rightStream = this.getClass().getResourceAsStream("/reports/ReportSummarySale/RightItem.jrxml");

            JasperReport headReport = JasperCompileManager.compileReport(headStream);
//            JasperReport crReport = JasperCompileManager.compileReport(crStream);
//            JasperReport rightReport = JasperCompileManager.compileReport(rightStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", response.getBrnCode());
            params.put("brnName", response.getBrnName());
            params.put("compName", response.getCompName());
            params.put("subReportCrItem",JasperCompileManager.compileReport(crStream));
            params.put("subReportDrItem",JasperCompileManager.compileReport(drStream));
            params.put("subReportRightItem",JasperCompileManager.compileReport(rightStream));

            //detail
            CollectionInputToReport collection = new CollectionInputToReport(response);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

//    public ResponseSummarySaleForPDF GetData(RequestGetDataModel requestGetDataModel) {
//        try {
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            String url = super.config.getUrlApi() + "/api/ReportSummarySale/GetReportSummarySalePDF";
//
//            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);
//
//            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
//
//            Gson gson = new Gson();
//            ResponseSummarySaleForPDF responseSummarySaleForPDF = gson.fromJson(response.getBody(), ResponseSummarySaleForPDF.class);
////            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
//            return responseSummarySaleForPDF;
//        } catch (Exception ex) {
//            ResponseSummarySaleForPDF responseSummarySaleForPDF = new ResponseSummarySaleForPDF();
//            return responseSummarySaleForPDF;
//        }
//    }

}
