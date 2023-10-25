package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;
import report.api.ReportConfig;
import report.api.models.AppConfigModel;
import report.api.models.Finance.Fin03;
import report.api.models.Finance.RequestDataModel;
import report.api.models.Goverment.Gov11;
import report.api.models.ReportStock.StockRequest;
import report.api.models.ReportStock.StockResponse;
import report.api.models.TokenModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BaseRepository {
    protected AppConfigModel config;
    protected Environment env;

    public BaseRepository(Environment environment) {
        env = environment;
        config = new AppConfigModel();
        initial();
    }

    private void initial() {
        String url = this.env.getProperty("URL_REPORT_API");
        config.setUrlApi((url == null)? ReportConfig.getServiceApi():url);
    }


    public String GetToken() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = this.config.getUrlApi() + "/api/Auth/GenerateToken";

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("ProgramId", "582DBE926101B5E02F0D523A5232C8DE");

            HttpEntity<String> entity = new HttpEntity<String>(headers);
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST,entity, new ParameterizedTypeReference<String>() {});
            Gson gson = new Gson();
            String token = gson.fromJson(response.getBody(),new TypeToken<String>() {}.getType());

            return token;
        } catch (Exception ex) {
            return "";
        }
    }

    public String GetToken(String ProgramId) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = this.config.getUrlApi() + "/api/Auth/GenerateToken";

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("ProgramId", ProgramId);

            HttpEntity<String> entity = new HttpEntity<String>(headers);
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST,entity, new ParameterizedTypeReference<String>() {});
            Gson gson = new Gson();
            String token = gson.fromJson(response.getBody(),new TypeToken<String>() {}.getType());

            return token;
        } catch (Exception ex) {
            return "";
        }
    }

}
