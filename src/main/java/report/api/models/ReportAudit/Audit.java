package report.api.models.ReportAudit;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.ReportStock.StockDetail;

import java.util.ArrayList;
import java.util.List;

public class Audit {
    private String productGroupId;
    private String productGroupName;
    private List<AuditDetail> auditDts = new ArrayList<>();
    private JRBeanCollectionDataSource auditDetailDataSource;

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public List<AuditDetail> getAuditDts() {
        return auditDts;
    }

    public void setAuditDts(List<AuditDetail> auditDts) {
        this.auditDts = auditDts;
    }

    public JRBeanCollectionDataSource getAuditDetailDataSource() {
        return new JRBeanCollectionDataSource(auditDts, false);
    }
}
