package report.api.models.ReportStock;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    private JRBeanCollectionDataSource stockDataSource;

    public void setStockDataSource(JRBeanCollectionDataSource stockDataSource) {
        this.stockDataSource = stockDataSource;
    }

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("stockDataSource", stockDataSource);
        return dataSources;
    }
}
