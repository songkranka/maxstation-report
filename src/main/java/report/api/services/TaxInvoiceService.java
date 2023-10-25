package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import report.api.models.TaxInvoice.*;
import report.api.repository.TaxInvoiceRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaxInvoiceService extends BaseService   {
		
	public TaxInvoiceService(Environment environment) {
		super(environment);
		// TODO Auto-generated constructor stub
	}
	
//	public String TestUrlApi() {
//		return super.config.getUrlApi();
//	}
//

    public JasperPrint GenReportTaxInvoice(RequestGetDataModel dataModel) throws Exception {
        try{
            TaxInvoiceRepository repo = new TaxInvoiceRepository(super.env);
            TaxInvoiceHead dataset = repo.GetTaxInvoice(dataModel);


            String item_jrxml = "/reports/taxinvoice/taxinvoice_dt.jrxml";
            String head_jrxml = "";
            if(dataset.getDocType().equals("CashTax")){
                head_jrxml = "/reports/taxinvoice/cashtax_hd.jrxml";
            }else{
                head_jrxml = "/reports/taxinvoice/taxinvoice_hd.jrxml";
            }

            final InputStream head_stream = this.getClass().getResourceAsStream(head_jrxml);
            final InputStream item_stream = this.getClass().getResourceAsStream(item_jrxml);

            JasperReport head_report = JasperCompileManager.compileReport(head_stream);
            JasperReport item_report = JasperCompileManager.compileReport(item_stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("docNo", dataModel.DocNo);
            params.put("subReportItem", item_report);


            //detail
            CollectionInputToReport collection = new CollectionInputToReport();
            collection.setTaxInvoiceHead(dataset);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            //---------------------------------------//
            JasperPrint print = JasperFillManager.fillReport(head_report, params,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }




}
