package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import report.api.models.CreditNote.CollectionInputToReport;
import report.api.models.CreditNote.CreditNoteHd;
import report.api.models.CreditNote.RequestDataModel;
import report.api.repository.CreditNoteRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class CreditNoteService  extends BaseService  {
    public CreditNoteService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenReport(RequestDataModel dataModel) throws Exception {
        try{
            CreditNoteRepository repo = new CreditNoteRepository(super.env);
            CreditNoteHd dataset = repo.GetDocument(dataModel);
            String head_jrxml = "/reports/CreditNote/CreditNoteHd.jrxml";
            String item_jrxml = "/reports/CreditNote/CreditNoteDt.jrxml";

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
            collection.setCreditNoteHd(dataset);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JasperPrint print = JasperFillManager.fillReport(head_report, params,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
