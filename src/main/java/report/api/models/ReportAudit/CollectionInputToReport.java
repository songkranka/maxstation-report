package report.api.models.ReportAudit;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    AuditResponse dataset;
    public CollectionInputToReport(AuditResponse response){
        dataset = response;
    }

//    private JRBeanCollectionDataSource auditDataSource;
//
//    public void setAuditDataSource(JRBeanCollectionDataSource auditDataSource) {
//        this.auditDataSource = auditDataSource;
//    }

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("balanceQty", dataset.getBalanceQty());
        dataSources.put("itemQty", dataset.getItemQty());
        dataSources.put("diffQty", dataset.getDiffQty());
        dataSources.put("adjustQty", dataset.getAdjustQty());
        dataSources.put("sumTotal", dataset.getSumTotal());
        dataSources.put("noAdjustQty", dataset.getNoAdjustQty());
        dataSources.put("auditDataSource",  new JRBeanCollectionDataSource(dataset.getAudits()));

//        dataSources.put("auditDataSource", auditDataSource);

        return dataSources;
    }
}
