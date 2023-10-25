package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Goverment.*;
import report.api.models.TokenModel;

import java.util.ArrayList;
import java.util.List;

public class GovermentRepository extends  BaseRepository {

    public GovermentRepository(Environment environment) {
        super(environment);
    }


    public Gov01 GetData01(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov01PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            Gov01 result = gson.fromJson(response.getBody(), Gov01.class);
            return result;
        } catch (Exception ex) {
            Gov01 result = new Gov01();
            return result;
        }
    }

    public Gov03 GetData03(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov03PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            Gov03 result = gson.fromJson(response.getBody(), Gov03.class);
            return result;
        } catch (Exception ex) {
            Gov03 result = new Gov03();
            return result;
        }
    }


    public List<GOV04> GetData04(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov04PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<GOV04> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<GOV04>>() {}.getType());
            //ResponseTankModelForPDF responseTankModelForPDF = gson.fromJson(response.getBody(), ResponseTankModelForPDF.class);
            return result;
        } catch (Exception ex) {
            List<GOV04> result = new ArrayList<>();
            return result;
        }
    }

    public List<GOV05> GetData05(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov05PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<GOV05> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<GOV05>>() {}.getType());
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return result;
        } catch (Exception ex) {
            List<GOV05> result = new ArrayList<>();
            return result;
        }
    }


    public List<GOV06> GetData06(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov06PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<GOV06> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<GOV06>>() {}.getType());
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return result;
        } catch (Exception ex) {
            List<GOV06> result = new ArrayList<>();
            return result;
        }
    }


    public List<Gov07> GetData07(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov07PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Gov07> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Gov07>>() {}.getType());
            //ResponseTankModelForPDF responseTankModelForPDF = gson.fromJson(response.getBody(), ResponseTankModelForPDF.class);
            return result;
        } catch (Exception ex) {
            List<Gov07> result = new ArrayList<>();
            return result;
        }
    }


    public List<Gov08> GetData08(RequestDataModel requestGetDataModel) {

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov08PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Gov08> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Gov08>>() {}.getType());
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return result;
        } catch (Exception ex) {
            List<Gov08> result = new ArrayList<>();
            return result;
        }
    }

    public List<Gov09> GetData09(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov09PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Gov09> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Gov09>>() {}.getType());
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return result;
        } catch (Exception ex) {
            List<Gov09> result = new ArrayList<>();
            return result;
        }
    }


    public List<Gov11> GetGOV11(RequestDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Goverment/GetGov11PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Gov11> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Gov11>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            List<Gov11> responseData = new ArrayList<>();
            return responseData;
        }
    }

}
