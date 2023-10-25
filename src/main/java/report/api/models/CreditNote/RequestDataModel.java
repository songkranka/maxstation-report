package report.api.models.CreditNote;

public class RequestDataModel {
    public String CompCode;
    public String BrnCode;
    public String LocCode;
    public String DocNo;
    public String EmpCode;

    public RequestDataModel(String compCode, String brnCode,String locCode,String docNo, String empCode) {
        CompCode = compCode;
        BrnCode = brnCode;
        LocCode = locCode;
        DocNo = docNo;
        EmpCode = empCode;
    }
}
