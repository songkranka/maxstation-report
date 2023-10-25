package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Customer.Debtor02;
import report.api.models.Customer.RequestDataModel;
import report.api.repository.CustomerRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CustomerService extends BaseService  {
    public CustomerService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenDebtor02(RequestDataModel request) throws Exception {
        try{
            CustomerRepository repo = new CustomerRepository(super.env);
            List<Debtor02> dataset = repo.GetDebtor02(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Customer/Debtor02.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            //detail
            //CollectionInputToReport collection = new CollectionInputToReport(dataset);
            //JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
