package report.api.models.ReportSummaryOilBalance;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    public CollectionInputToReport(ResponseTankModelForPDF _resp) {
        response = _resp;
    }
    private ResponseTankModelForPDF response;



//    private JRBeanCollectionDataSource hdTankModelForPDFDataSource;
//
//    public JRBeanCollectionDataSource getHdTankModelForPDFDataSource() {
//        return hdTankModelForPDFDataSource;
//    }
//
//    public void setHdTankModelForPDFDataSource(JRBeanCollectionDataSource hdTankModelForPDFDataSource) {
//        this.hdTankModelForPDFDataSource = hdTankModelForPDFDataSource;
//    }

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("compName", response.getCompName());
//        dataSources.put("brnCode", response.getBrnCode());
        dataSources.put("brnName", response.getBrnName());

        dataSources.put("hdTankModelForPDFDataSource", new JRBeanCollectionDataSource(response.getTankData()));
        return dataSources;
    }
}
