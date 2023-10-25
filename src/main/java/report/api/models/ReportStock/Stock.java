package report.api.models.ReportStock;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String productGroupId;
    private String productGroupName;
    private List<StockDetail> stockDts = new ArrayList<>();
    private JRBeanCollectionDataSource stockDetailDataSource;

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

    public List<StockDetail> getStockDts() {
        return stockDts;
    }

    public void setStockDts(List<StockDetail> stockDts) {
        this.stockDts = stockDts;
    }

    public JRBeanCollectionDataSource getStockDetailDataSource() {
        return new JRBeanCollectionDataSource(stockDts, false);
    }
}
