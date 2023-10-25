package report.api.repository;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReceivePay.FinReceiveHd;
import report.api.models.ReceivePay.RequestGetDataModel;

public class ReceivePayRepository extends  BaseRepository {

    public ReceivePayRepository(Environment environment) {
        super(environment);
    }

    public FinReceiveHd GetData(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/ReceivePay/GetReceivePayPDF";
            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            FinReceiveHd responseFinReceiveHd = gson.fromJson(response.getBody(), FinReceiveHd.class);
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return responseFinReceiveHd;
        } catch (Exception ex) {
            FinReceiveHd responseFinReceiveHd = new FinReceiveHd();
            return responseFinReceiveHd;
        }
    }


}
