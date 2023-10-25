package report.api.models.ReportSummarySale;

public class DispOfSummerySaleForPDF {
    public String dispName;
    public double meterStart;
    public double meterFinish;
    public double totalQty;
    public double unitPrice;
    public double totalAmt;

    public String getDispName() {
        return dispName;
    }

    public void setDispName(String dispName) {
        this.dispName = dispName;
    }

    public double getMeterStart() {
        return meterStart;
    }

    public void setMeterStart(double meterStart) {
        this.meterStart = meterStart;
    }

    public double getMeterFinish() {
        return meterFinish;
    }

    public void setMeterFinish(double meterFinish) {
        this.meterFinish = meterFinish;
    }

    public double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(double totalQty) {
        this.totalQty = totalQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }
}
