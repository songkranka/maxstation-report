package report.api.models.Finance;

public class RequestDataModel {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;

    public RequestDataModel(String compCode, String brnCode, String dateFrom,String dateTo) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
    }
}
