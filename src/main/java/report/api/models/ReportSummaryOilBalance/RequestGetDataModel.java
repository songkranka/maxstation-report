package report.api.models.ReportSummaryOilBalance;

public class RequestGetDataModel {
    public String CompCode;
    public String BrnCode;
    public String DocDate;

    public RequestGetDataModel(String compCode, String brnCode, String docDate) {
        CompCode = compCode;
        BrnCode = brnCode;
        DocDate = docDate;
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
}
