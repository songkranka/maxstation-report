package report.api.models.TaxInvoice;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DocNo;
    public String Guid;
    public String EmpCode;

    public RequestGetDataModel(String compCode, String brnCode,String docNo, String guid,String empCode) {
        CompCode = compCode;
        BrnCode = brnCode;
        DocNo = docNo;
        Guid = guid;
        EmpCode = empCode;
    }
}
