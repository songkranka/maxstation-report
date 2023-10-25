package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Meter.MeterRepair;
import report.api.models.Meter.MeterTest;
import report.api.models.Meter.RequestGetDataModel;

import java.util.ArrayList;
import java.util.List;

public class MeterRepository extends BaseRepository {
    public MeterRepository(Environment environment) {
        super(environment);
    }



    public List<MeterRepair> GetMeterRepair(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Meter/GetMeterRepairPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //MeterTest responseData = gson.fromJson(response.getBody(), MeterTest.class);
            List<MeterRepair> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<MeterRepair>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<MeterRepair> responseData = new ArrayList<>();
            return responseData;
        }
    }



    public List<MeterTest> GetMeterTest(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Meter/GetMeterTestPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //MeterTest responseData = gson.fromJson(response.getBody(), MeterTest.class);
            List<MeterTest> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<MeterTest>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<MeterTest> responseData = new ArrayList<>();
            return responseData;
        }
    }

}
