package report.api.models.Inventory;

import java.util.Date;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;
    public int ReportType;
    public String ProductIdStart;
    public String ProductIdEnd;
    public String ProductGroupIdStart;
    public String ProductGroupIdEnd;

    public RequestGetDataModel(String compCode, String brnCode,String dateFrom,String  dateTo,int reportType,String productIdStart, String productIdEnd, String productGroupIdStart, String productGroupIdEnd) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
        ReportType = reportType;
        ProductIdStart = productIdStart;
        ProductIdEnd = productIdEnd;
        ProductGroupIdStart = productGroupIdStart;
        ProductGroupIdEnd = productGroupIdEnd;
    }
}


