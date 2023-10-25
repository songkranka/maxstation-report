package report.api.repository;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReportAudit.AuditRequest;
import report.api.models.ReportAudit.AuditResponse;

public class ReportAuditRepository extends  BaseRepository  {
    public ReportAuditRepository(Environment environment) {
        super(environment);
    }


    public AuditResponse GetDetailData(AuditRequest requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReportAudit/AuditDetailPDF";

            HttpEntity<AuditRequest> request = new HttpEntity<>(requestGetDataModel, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            AuditResponse responseModelForPDF = gson.fromJson(response.getBody(), AuditResponse.class);

            return responseModelForPDF;
        } catch (Exception ex) {
            AuditResponse responseModelForPDF = new AuditResponse();
            return responseModelForPDF;
        }
    }

    public AuditResponse GetDiffData(AuditRequest requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReportAudit/AuditDiffPDF";

            HttpEntity<AuditRequest> request = new HttpEntity<>(requestGetDataModel, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            AuditResponse responseModelForPDF = gson.fromJson(response.getBody(), AuditResponse.class);

            return responseModelForPDF;
        } catch (Exception ex) {
            AuditResponse responseModelForPDF = new AuditResponse();
            return responseModelForPDF;
        }
    }

}
