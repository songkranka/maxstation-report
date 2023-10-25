package report.api.repository;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReportSummaryOilBalance.RequestGetDataModel;
import report.api.models.ReportSummaryOilBalance.ResponseTankModelForPDF;

public class SummaryOilBalanceRepository  extends  BaseRepository {


    public SummaryOilBalanceRepository(Environment environment) {
        super(environment);
    }


    public ResponseTankModelForPDF GetData(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReportSummaryOilBalance/GetReportSummaryOilBalancePDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            ResponseTankModelForPDF responseTankModelForPDF = gson.fromJson(response.getBody(), ResponseTankModelForPDF.class);
            return responseTankModelForPDF;
        } catch (Exception ex) {
            ResponseTankModelForPDF responseTankModelForPDF = new ResponseTankModelForPDF();
            return responseTankModelForPDF;
        }
    }
}
