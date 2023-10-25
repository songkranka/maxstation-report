package report.api.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import report.api.models.TaxInvoice.RequestGetDataModel;
import report.api.models.TaxInvoice.TaxInvoiceHd;
import report.api.models.TaxInvoice.TaxInvoiceHead;

import java.util.ArrayList;
import java.util.List;

public class TaxInvoiceRepository extends  BaseRepository  {


    public TaxInvoiceRepository(Environment environment) {
        super(environment);
    }

//    public List<TaxInvoiceHd> GetData(String guid, String empcode) {
//        RestTemplate restTemplate = new RestTemplate();
//        String fooResourceUrl = super.config.getUrlApi() + "/api/TaxInvoice/GetTaxInvoice?guid=" + guid + "&empcode="+ empcode;
//        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
//
//        Gson gson = new Gson();
//        TaxInvoiceHd jsonObj = gson.fromJson(response.getBody(), TaxInvoiceHd.class);
//
//        List<TaxInvoiceHd> taxinvoices = new ArrayList<>();
//        taxinvoices.add(jsonObj);
//        return taxinvoices;
//    }

    /* new */
    public TaxInvoiceHead GetTaxInvoice(RequestGetDataModel requestGetDataModel) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Authorization","Bearer " + super.GetToken());
            String url = super.config.getUrlApi() + "/api/TaxInvoice/PrintPdf";

            HttpEntity<RequestGetDataModel> request = new HttpEntity<>(requestGetDataModel, headers);

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

            Gson gson = new Gson();
            return gson.fromJson(response.getBody(),new TypeToken<TaxInvoiceHead>() {}.getType());
        } catch (Exception ex) {
            return new TaxInvoiceHead();
        }
    }

}
