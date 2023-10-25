package report.api.models.CreditNote;

public class CreditNoteDt {
    private int seqNo;
    private String pdId;
    private String pdName;
    private String unitName;
    private double beforePrice;
    private double afterPrice;
    private double beforeQty;
    private double afterQty;
    private double beforeAmt;
    private double afterAmt;

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public double getBeforePrice() {
        return beforePrice;
    }

    public void setBeforePrice(double beforePrice) {
        this.beforePrice = beforePrice;
    }

    public double getAfterPrice() {
        return afterPrice;
    }

    public void setAfterPrice(double afterPrice) {
        this.afterPrice = afterPrice;
    }

    public double getBeforeQty() {
        return beforeQty;
    }

    public void setBeforeQty(double beforeQty) {
        this.beforeQty = beforeQty;
    }

    public double getAfterQty() {
        return afterQty;
    }

    public void setAfterQty(double afterQty) {
        this.afterQty = afterQty;
    }

    public double getBeforeAmt() {
        return beforeAmt;
    }

    public void setBeforeAmt(double beforeAmt) {
        this.beforeAmt = beforeAmt;
    }

    public double getAfterAmt() {
        return afterAmt;
    }

    public void setAfterAmt(double afterAmt) {
        this.afterAmt = afterAmt;
    }
}
