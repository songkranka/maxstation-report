package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Finance.Fin03;
import report.api.models.Finance.Fin08;
import report.api.models.Finance.RequestDataModel;

import java.util.ArrayList;
import java.util.List;


public class FinanceRepository extends  BaseRepository {
    public FinanceRepository(Environment environment) {
        super(environment);
    }


    public List<Fin03> GetFin03PDF(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Finance/GetFin03PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Fin03> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Fin03>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Fin03> result = new ArrayList<>();
            return result;
        }
    }


    public List<Fin08> GetFin08PDF(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Finance/GetFin08PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Fin08> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Fin08>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Fin08> result = new ArrayList<>();
            return result;
        }
    }

}
