package report.api.repository;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReportSummarySale.RequestGetDataModel;
import report.api.models.ReportSummarySale.ResponseSummarySaleForPDF;

public class SummarySaleRepository extends  BaseRepository  {

    public SummarySaleRepository(Environment environment) {
        super(environment);
    }

    public ResponseSummarySaleForPDF GetData(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReportSummarySale/GetReportSummarySalePDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            ResponseSummarySaleForPDF responseSummarySaleForPDF = gson.fromJson(response.getBody(), ResponseSummarySaleForPDF.class);
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return responseSummarySaleForPDF;
        } catch (Exception ex) {
            ResponseSummarySaleForPDF responseSummarySaleForPDF = new ResponseSummarySaleForPDF();
            return responseSummarySaleForPDF;
        }
    }
}
