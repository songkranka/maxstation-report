package report.api.services;

import com.google.gson.Gson;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReceivePay.CollectionInputToReport;
import report.api.models.ReceivePay.FinReceiveHd;
import report.api.models.ReceivePay.RequestGetDataModel;
import report.api.models.ReceivePay.ResponseReceivePay;
import report.api.repository.ReceivePayRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReceivePayService extends BaseService {
    public ReceivePayService(Environment environment) {
        super(environment);
    }

    public  String GetUrlApi(){
        return super.config.getUrlApi();
    }


    public JasperPrint GenReport(RequestGetDataModel dataModel) throws Exception {
        try{
            ReceivePayRepository repo = new ReceivePayRepository(super.env);
            FinReceiveHd finReceiveHd = repo.GetData(dataModel);
            String jrxml = "";

           if(finReceiveHd!= null && finReceiveHd.getReceiveTypeId().equals("3")){
                jrxml = "/reports/ReceivePay/Receive3.jrxml";
            }else{
                jrxml = "/reports/ReceivePay/Receive1.jrxml";
            }
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", dataModel.BrnCode);

            //detail
            CollectionInputToReport collectionInputToReport = new CollectionInputToReport();
            collectionInputToReport.setFinReceiveHd(finReceiveHd);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));

            //---------------------------------------//
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});

            JasperPrint print = JasperFillManager.fillReport(report, params,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }




}
