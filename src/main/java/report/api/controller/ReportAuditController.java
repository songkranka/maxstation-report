package report.api.controller;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.ReportAudit.AuditRequest;
import report.api.models.ReportAudit.AuditResponse;
import report.api.models.ReportAudit.CollectionInputToReport;
import report.api.services.ReportAuditService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/ReportAudit/") // http://localhost:8080/ReportAudit/ReportAudit/
public class ReportAuditController extends BaseController {
    public ReportAuditController(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Detail")
    public void GenReportDetail(HttpServletResponse response, @RequestBody AuditRequest dataModel) throws Exception {
        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReportAuditService service = new ReportAuditService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportDetail(dataModel), byteArr);
        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "Diff")
    public void GenReportDiff(HttpServletResponse response, @RequestBody AuditRequest dataModel) throws Exception {
        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        response.setContentType("application/pdf; charset=UTF-8");

        ReportAuditService service = new ReportAuditService(super.env);
        net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(service.GenReportDiff(dataModel), byteArr);
        response.setContentLength(byteArr.size());
        ServletOutputStream outPut = response.getOutputStream();
        byteArr.writeTo(outPut);
        outPut.flush();
    }

}
