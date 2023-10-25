package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.CreditNote.CreditNoteHd;
import report.api.models.CreditNote.RequestDataModel;

public class CreditNoteRepository extends  BaseRepository {
    public CreditNoteRepository(Environment environment) {
        super(environment);
    }

    public CreditNoteHd GetDocument(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/CreditNote/PrintPdf";
            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
            Gson gson = new Gson();
            return gson.fromJson(response.getBody(),new TypeToken<CreditNoteHd>() {}.getType());
        } catch (Exception ex) {
            return new CreditNoteHd();
        }
    }

}
