package report.api.models.Meter;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;

    public RequestGetDataModel(String compCode, String brnCode, String dateFrom,String dateTo) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
    }

}
