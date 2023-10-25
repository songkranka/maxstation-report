package report.api.models.ReceivePay;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DocNo;

    public RequestGetDataModel(String compCode, String brnCode, String docDate) {
        CompCode = compCode;
        BrnCode = brnCode;
        DocNo = docDate;
    }
}
