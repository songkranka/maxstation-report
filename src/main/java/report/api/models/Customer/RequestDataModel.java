package report.api.models.Customer;

public class RequestDataModel {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;
    public String CustCodeFrom;
    public String CustCodeTo;

    public RequestDataModel(String compCode, String brnCode, String dateFrom,String dateTo,String custCodeFrom,String custCodeTo) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
        CustCodeFrom = custCodeFrom;
        CustCodeTo = custCodeTo;
    }

}
