package report.api.repository;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReportStock.StockRequest;
import report.api.models.ReportStock.StockResponse;

public class StockRepository extends BaseRepository {

    public StockRepository(Environment environment) {
        super(environment);
    }

    public StockResponse GetStockDaily(StockRequest requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReportStock/GetReportStockPDF";

            HttpEntity<StockRequest> request = new HttpEntity<>(requestGetDataModel, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            StockResponse responseModelForPDF = gson.fromJson(response.getBody(), StockResponse.class);

            return responseModelForPDF;
        } catch (Exception ex) {
            StockResponse responseModelForPDF = new StockResponse();
            return responseModelForPDF;
        }
    }

    public StockResponse GetStockMonthly(StockRequest requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReportStock/GetMonthlyPDF";

            HttpEntity<StockRequest> request = new HttpEntity<>(requestGetDataModel, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            StockResponse responseModelForPDF = gson.fromJson(response.getBody(), StockResponse.class);

            return responseModelForPDF;
        } catch (Exception ex) {
            StockResponse responseModelForPDF = new StockResponse();
            return responseModelForPDF;
        }
    }

}
