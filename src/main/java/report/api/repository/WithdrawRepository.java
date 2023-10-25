package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Withdraw.RequestGetDataModel;
import report.api.models.Withdraw.WithdrawHd;

import java.util.ArrayList;
import java.util.List;

public class WithdrawRepository extends BaseRepository {
    public WithdrawRepository(Environment environment) {
        super(environment);
    }


    public WithdrawHd GetDocument(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Withdraw/GetDocumentPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            //List<MeterTest> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<MeterTest>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            //List<MeterTest> responseData = new ArrayList<>();
            WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

}
