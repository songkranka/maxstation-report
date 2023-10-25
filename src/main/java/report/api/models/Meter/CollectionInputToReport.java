package report.api.models.Meter;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.ReportSummarySale.ResponseSummarySaleForPDF;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    /*constructor*/
    public CollectionInputToReport(MeterTest _resp) {
        response = _resp;
    }
    private MeterTest response;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("brnCode", response.getBrnCode());
        dataSources.put("brnName", response.getBrnName());
        dataSources.put("brnAddress", response.getBrnAddress());
        dataSources.put("compName", response.getCompName());
        dataSources.put("compAddress", response.getCompAddress());
        dataSources.put("compImage", response.getCompImage());
        dataSources.put("registerId", response.getRegisterId());


        return dataSources;
    }

}
