package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Sales.*;

import java.util.ArrayList;
import java.util.List;

public class SalesRepository extends BaseRepository{
    public SalesRepository(Environment environment) {
        super(environment);
    }


    public List<Sale02> GetSale02PDF(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Sales/GetSale02PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Sale02> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Sale02>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Sale02> result = new ArrayList<>();
            return result;
        }
    }


    public List<Sale03> GetSale03PDF(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Sales/GetSale03PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Sale03> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Sale03>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Sale03> result = new ArrayList<>();
            return result;
        }
    }

    public List<Sale04> GetSale04PDF(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Sales/GetSale04PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Sale04> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Sale04>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Sale04> result = new ArrayList<>();
            return result;
        }
    }


    public List<Sale06> GetSale06PDF(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Sales/GetSale06PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Sale06> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Sale06>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Sale06> result = new ArrayList<>();
            return result;
        }
    }

}
