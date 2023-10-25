package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Billing.BillingHd;
import report.api.models.Billing.CollectionInputToReport;
import report.api.models.Billing.RequestGetDataModel;
import report.api.repository.BillingRepository;
import report.api.repository.TaxInvoiceRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class BillingService extends BaseService {
    public BillingService(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    public JasperPrint GenReportBilling(RequestGetDataModel dataModel) throws Exception {
        try{
            BillingRepository repo = new BillingRepository(super.env);
            BillingHd dataset = repo.GetBilling(dataModel);
            String head_jrxml = "/reports/Billing/billing_hd.jrxml";
            //String item_jrxml = "/reports/billing/billing_dt.jrxml";

            final InputStream head_stream = this.getClass().getResourceAsStream(head_jrxml);
            //final InputStream item_stream = this.getClass().getResourceAsStream(item_jrxml);

            JasperReport head_report = JasperCompileManager.compileReport(head_stream);
            //JasperReport item_report = JasperCompileManager.compileReport(item_stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("docNo", dataModel.DocNo);
            //params.put("subReportItem", item_report);

            //detail
            CollectionInputToReport collection = new CollectionInputToReport();
            collection.setBillingHd(dataset);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JasperPrint print = JasperFillManager.fillReport(head_report, params,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
