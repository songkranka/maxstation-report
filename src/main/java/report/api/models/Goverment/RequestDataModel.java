package report.api.models.Goverment;

public class RequestDataModel {
    public String CompCode;
    public String BrnCode;
    public String DateFrom;
    public String DateTo;
    public int BranchType;
    public int UnitType;

    public RequestDataModel(String compCode, String brnCode, String dateFrom, String dateTo,int branchType,int unitType) {
        CompCode = compCode;
        BrnCode = brnCode;
        DateFrom = dateFrom;
        DateTo = dateTo;
        BranchType = branchType;
        UnitType = unitType;
    }
}
