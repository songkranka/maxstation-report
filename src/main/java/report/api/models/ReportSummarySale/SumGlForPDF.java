package report.api.models.ReportSummarySale;

public class SumGlForPDF {
    public String glType;
    public String glDesc;
    public double glAmt;

    public String getGlType() {
        return glType;
    }

    public void setGlType(String glType) {
        this.glType = glType;
    }

    public String getGlDesc() {
        return glDesc;
    }

    public void setGlDesc(String glDesc) {
        this.glDesc = glDesc;
    }

    public double getGlAmt() {
        return glAmt;
    }

    public void setGlAmt(double glAmt) {
        this.glAmt = glAmt;
    }
}
