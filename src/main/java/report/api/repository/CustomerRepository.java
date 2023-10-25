package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Customer.Debtor02;
import report.api.models.Customer.RequestDataModel;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository extends  BaseRepository{
    public CustomerRepository(Environment environment) {
        super(environment);
    }

    public List<Debtor02> GetDebtor02(RequestDataModel requestDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Customer/GetDebtor02PDF";

            HttpEntity<RequestDataModel> request = new HttpEntity<>(requestDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<Debtor02> result = gson.fromJson(response.getBody(),new TypeToken<ArrayList<Debtor02>>() {}.getType());
            return result;
        } catch (Exception ex) {
            List<Debtor02> result = new ArrayList<>();
            return result;
        }
    }

}
