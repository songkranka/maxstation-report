package report.api.services;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import report.api.models.VatSale.RequestGetDataModel;
import report.api.models.VatSale.VatSale;

@Service
public class VatSaleService extends BaseService {

    public VatSaleService(Environment environment) {
        super(environment);
    }
    public  String GetUrlApi(){
        return super.config.getUrlApi();
    }


    public VatSale GetData(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            String url = super.config.getUrlApi() + "/api/VatSale/GetVatSalePDF";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            VatSale responseVatSale = gson.fromJson(response.getBody(), VatSale.class);
//            ResponseTankModelForPDF listResponseData = gson.fromJson(response.getBody(), new TypeToken<List<HdTankModelForPDF>>(){}.getType());
            return responseVatSale;
        } catch (Exception ex) {
            VatSale responseVatSale = new VatSale();
            return responseVatSale;
        }
    }



}
