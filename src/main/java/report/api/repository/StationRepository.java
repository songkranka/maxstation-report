package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Station.*;

import java.util.ArrayList;
import java.util.List;

public class StationRepository extends BaseRepository {
    public StationRepository(Environment environment) {
        super(environment);
    }


    public CashierModel GetST312(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Station/GetCashierPDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            CashierModel responseCashier = gson.fromJson(response.getBody(), CashierModel.class);
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return responseCashier;
        } catch (Exception ex) {
            CashierModel responseCashier = new CashierModel();
            return responseCashier;
        }
    }


    public List<ST313> GetST313(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Station/GetST313PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //CashierModel responseCashier = gson.fromJson(response.getBody(), CashierModel.class);
            List<ST313> responseData = gson.fromJson(response.getBody(), new TypeToken<List<ST313>>(){}.getType());
            return responseData;
        } catch (Exception ex) {
//            CashierModel responseCashier = new CashierModel();
            List<ST313> responseData = new ArrayList<>();
            return responseData;
        }
    }

    public List<ST315> GetST315(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Station/GetST315PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //CashierModel responseCashier = gson.fromJson(response.getBody(), CashierModel.class);
            List<ST315> responseData = gson.fromJson(response.getBody(), new TypeToken<List<ST315>>(){}.getType());
            return responseData;
        } catch (Exception ex) {
//            CashierModel responseCashier = new CashierModel();
            List<ST315> responseData = new ArrayList<>();
            return responseData;
        }
    }


    public List<ST316> GetST316(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            String url = super.config.getUrlApi() + "/api/Station/GetST316PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //CashierModel responseCashier = gson.fromJson(response.getBody(), CashierModel.class);
            List<ST316> responseData = gson.fromJson(response.getBody(), new TypeToken<List<ST316>>(){}.getType());
            return responseData;
        } catch (Exception ex) {
//            CashierModel responseCashier = new CashierModel();
            List<ST316> responseData = new ArrayList<>();
            return responseData;
        }
    }


    public List<ST317> GetST317(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            String url = super.config.getUrlApi() + "/api/Station/GetST317PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //CashierModel responseCashier = gson.fromJson(response.getBody(), CashierModel.class);
            List<ST317> responseData = gson.fromJson(response.getBody(), new TypeToken<List<ST317>>(){}.getType());
            return responseData;
        } catch (Exception ex) {
//            CashierModel responseCashier = new CashierModel();
            List<ST317> responseData = new ArrayList<>();
            return responseData;
        }
    }


}
