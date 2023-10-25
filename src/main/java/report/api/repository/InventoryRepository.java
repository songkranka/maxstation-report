package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.Inventory.*;

import java.util.ArrayList;
import java.util.List;

public class InventoryRepository extends  BaseRepository {

    public InventoryRepository(Environment environment) {
        super(environment);
    }


    public List<InvWithdraw> GetWithdraw(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetWithdrawPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvWithdraw> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvWithdraw>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvWithdraw> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

    public List<InvReceiveProd> GetReceiveProd(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetReceiveProdPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvReceiveProd> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvReceiveProd>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvReceiveProd> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

    public List<InvReturnSup> GetReturnSup(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetReturnSupPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvReturnSup> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvReturnSup>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvReturnSup> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

    public List<InvReturnOil> GetReturnOil(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetReturnOilPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvReturnOil> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvReturnOil>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvReturnOil> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

    public List<InvTransferIn> GetTransferIn(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetTransferInPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvTransferIn> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvTransferIn>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvTransferIn> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }
    public List<InvTransferOut> GetTransferOut(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetTransferOutPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvTransferOut> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvTransferOut>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvTransferOut> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }
    public List<InvTransferCompare> GetTransferCompare(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetTransferComparePDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<InvTransferCompare> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvTransferCompare>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvTransferCompare> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

    public List<InvTransferNotIn> GetTransferNotIn(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetTransferNotInPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            List<InvTransferNotIn> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvTransferNotIn>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvTransferNotIn> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }
    public List<InvAdjust> GetAdjust(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/Inventory/GetAdjustPDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            //WithdrawHd responseData = gson.fromJson(response.getBody(), WithdrawHd.class);
            List<InvAdjust> responseData = gson.fromJson(response.getBody(),new TypeToken<ArrayList<InvAdjust>>() {}.getType());
            return responseData;
        } catch (Exception ex) {
            ex.printStackTrace();
            List<InvAdjust> responseData = new ArrayList<>();
            //WithdrawHd responseData = new WithdrawHd();
            return responseData;
        }
    }

}
