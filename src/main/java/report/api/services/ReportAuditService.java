package report.api.services;

import com.google.gson.Gson;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import report.api.models.ReportAudit.AuditRequest;
import report.api.models.ReportAudit.AuditResponse;
import report.api.models.ReportAudit.CollectionInputToReport;
import report.api.models.ReportStock.StockRequest;
import report.api.models.ReportStock.StockResponse;
import report.api.repository.ReportAuditRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportAuditService extends BaseService {
    public ReportAuditService(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }


    public JasperPrint GenReportDetail(AuditRequest dataModel) throws Exception {
        try{
            ReportAuditRepository repo = new ReportAuditRepository(super.env);
            AuditResponse response = repo.GetDetailData(dataModel);

            //params
            final InputStream stream = this.getClass().getResourceAsStream("/reports/ReportAudit/Audit.jrxml");
            JasperReport report = JasperCompileManager.compileReport(stream);
            Map<String, Object> params = new HashMap<>();

            params.put("brnCode", response.getBrnCode());
            params.put("brnName", response.getBrnName());
            params.put("compName", response.getCompName());
            params.put("compImage", response.getCompImage());
            params.put("docNo", response.getDocNo());
            params.put("docDate", response.getDocDate());
            params.put("reportName", "รายละเอียดการตรวจนับสินค้า");

            //detail
            CollectionInputToReport collection = new CollectionInputToReport(response);
            //JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(response.getAudits());
            //collectionInputToReport.setAuditDataSource(source);

            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenReportDiff(AuditRequest dataModel) throws Exception {
        try{
            ReportAuditRepository repo = new ReportAuditRepository(super.env);
            AuditResponse response = repo.GetDiffData(dataModel);

            //params
            final InputStream stream = this.getClass().getResourceAsStream("/reports/ReportAudit/Audit.jrxml");
            JasperReport report = JasperCompileManager.compileReport(stream);
            Map<String, Object> params = new HashMap<>();

            params.put("brnCode", response.getBrnCode());
            params.put("brnName", response.getBrnName());
            params.put("compName", response.getCompName());
            params.put("compImage", response.getCompImage());
            params.put("docNo", response.getDocNo());
            params.put("docDate", response.getDocDate());
            params.put("reportName", "รายละเอียดการตรวจนับสินค้า(เฉพาะที่มีผลต่าง)");

            //detail
            CollectionInputToReport collection = new CollectionInputToReport(response);
            //JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(response.getAudits());
            //collectionInputToReport.setAuditDataSource(source);

            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
