package report.api.models.Billing;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DocNo;
    public String EmpCode;

    public RequestGetDataModel(String compCode, String brnCode,String docNo, String empCode) {
        CompCode = compCode;
        BrnCode = brnCode;
        DocNo = docNo;
        EmpCode = empCode;
    }
}
