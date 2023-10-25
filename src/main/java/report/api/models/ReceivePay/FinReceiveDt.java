package report.api.models.ReceivePay;

public class FinReceiveDt {
    private String  pdId;
    private String pdName;
    private double itemAmt;

    public String getPdId() {
        return pdId;
    }

    public void setPdId(String pdId) {
        this.pdId = pdId;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public double getItemAmt() {
        return itemAmt;
    }

    public void setItemAmt(double itemAmt) {
        this.itemAmt = itemAmt;
    }
}
