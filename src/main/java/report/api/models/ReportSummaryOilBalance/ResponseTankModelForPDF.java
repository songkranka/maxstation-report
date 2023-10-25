package report.api.models.ReportSummaryOilBalance;

import java.util.List;

public class ResponseTankModelForPDF {
    private String brnCode;
    private String brnName;
    private String docDate;
    private String compName;
    private List<HdTankModelForPDF> tankData;
    private List<HdTankModelForPDF> tankSum;

    public String getBrnCode() {
        return brnCode;
    }

    public void setBrnCode(String brnCode) {
        this.brnCode = brnCode;
    }

    public String getBrnName() {
        return brnName;
    }

    public void setBrnName(String brnName) {
        this.brnName = brnName;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public List<HdTankModelForPDF> getTankData() {
        return tankData;
    }

    public void setTankData(List<HdTankModelForPDF> tankData) {
        this.tankData = tankData;
    }

    public List<HdTankModelForPDF> getTankSum() {
        return tankSum;
    }

    public void setTankSum(List<HdTankModelForPDF> tankSum) {
        this.tankSum = tankSum;
    }
}
