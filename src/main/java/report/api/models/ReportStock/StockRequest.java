package report.api.models.ReportStock;

import java.util.Date;

public class StockRequest {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;
    public String ProductIdStart;
    public String ProductIdEnd;
    public String ProductGroupIdStart;
    public String ProductGroupIdEnd;

    public StockRequest(String compCode, String brnCode,String dateFrom,String dateTo, String productIdStart, String productIdEnd, String productGroupIdStart, String productGroupIdEnd) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
        ProductIdStart = productIdStart;
        ProductIdEnd = productIdEnd;
        ProductGroupIdStart = productGroupIdStart;
        ProductGroupIdEnd = productGroupIdEnd;
    }

    public String getCompCode() {
        return CompCode;
    }

    public void setCompCode(String compCode) {
        CompCode = compCode;
    }

    public String getBrnCode() {
        return BrnCode;
    }

    public void setBrnCode(String brnCode) {
        BrnCode = brnCode;
    }

    public String getProductIdStart() {
        return ProductIdStart;
    }

    public void setProductIdStart(String productIdStart) {
        ProductIdStart = productIdStart;
    }

    public String getProductIdEnd() {
        return ProductIdEnd;
    }

    public void setProductIdEnd(String productIdEnd) {
        ProductIdEnd = productIdEnd;
    }

    public String getProductGroupIdStart() {
        return ProductGroupIdStart;
    }

    public void setProductGroupIdStart(String productGroupIdStart) {
        ProductGroupIdStart = productGroupIdStart;
    }

    public String getProductGroupIdEnd() {
        return ProductGroupIdEnd;
    }

    public void setProductGroupIdEnd(String productGroupIdEnd) {
        ProductGroupIdEnd = productGroupIdEnd;
    }
}
