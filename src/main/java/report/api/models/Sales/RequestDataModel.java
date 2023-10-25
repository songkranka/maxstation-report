package report.api.models.Sales;

public class RequestDataModel {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;
    public int ReportType;
    public String CustCodeFrom;
    public String CustCodeTo;
    public String PdIdFrom;
    public String PdIdTo;
    public int DocType;


    public RequestDataModel(String compCode, String brnCode,String dateFrom,String  dateTo,int reportType,String custCodeFrom,String custCodeTo,String pdIdFrom,String pdIdTo,int docType) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
        ReportType = reportType;
        CustCodeFrom = custCodeFrom;
        CustCodeTo = custCodeTo;
        PdIdFrom = pdIdFrom;
        PdIdTo = pdIdTo;
    }
}
