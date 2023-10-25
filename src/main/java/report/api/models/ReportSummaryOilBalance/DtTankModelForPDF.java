package report.api.models.ReportSummaryOilBalance;

public class DtTankModelForPDF {
    private String tankId;
    private String pdName;
    private double beforeQty;
    private double receiveQty;
    private double transferQty;
    private double issueQty;
    private double remainQty;
    private double realQty;
    private double diffQty;

    public String getTankId() {
        return tankId;
    }

    public void setTankId(String tankId) {
        this.tankId = tankId;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public double getBeforeQty() {
        return beforeQty;
    }

    public void setBeforeQty(double beforeQty) {
        this.beforeQty = beforeQty;
    }

    public double getReceiveQty() {
        return receiveQty;
    }

    public void setReceiveQty(double receiveQty) {
        this.receiveQty = receiveQty;
    }

    public double getTransferQty() {
        return transferQty;
    }

    public void setTransferQty(double transferQty) {
        this.transferQty = transferQty;
    }

    public double getIssueQty() {
        return issueQty;
    }

    public void setIssueQty(double issueQty) {
        this.issueQty = issueQty;
    }

    public double getRemainQty() {
        return remainQty;
    }

    public void setRemainQty(double remainQty) {
        this.remainQty = remainQty;
    }

    public double getRealQty() {
        return realQty;
    }

    public void setRealQty(double realQty) {
        this.realQty = realQty;
    }

    public double getDiffQty() {
        return diffQty;
    }

    public void setDiffQty(double diffQty) {
        this.diffQty = diffQty;
    }
}
