package report.api.models.ReportSummarySale;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DocDate;
    public int PeriodNo;

    public RequestGetDataModel(String compCode, String brnCode, String docDate, int periodNo) {
        CompCode = compCode;
        BrnCode = brnCode;
        DocDate = docDate;
        PeriodNo = periodNo;
    }

    public String getCompCode() {
        return CompCode;
    }

    public void setCompCode(String compCode) {
        CompCode = compCode;
    }

    public String getBrnCode() {
        return BrnCode;
    }

    public void setBrnCode(String brnCode) {
        BrnCode = brnCode;
    }

    public String getDocDate() {
        return DocDate;
    }

    public void setDocDate(String docDate) {
        DocDate = docDate;
    }

    public int getPeriodNo() {
        return PeriodNo;
    }

    public void setPeriodNo(int periodNo) {
        PeriodNo = periodNo;
    }
}
