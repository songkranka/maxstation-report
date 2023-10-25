package report.api.models.TaxInvoice;

public class TaxInvoiceItem {
    private int seqNo;
    private String pdId;
    private String pdName;
    private String unitName;
    private double itemQty;
    private double unitPrice;
    private double discAmt;
    private double subAmt;
    private String licensePlate;

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

    public double getItemQty() {
        return itemQty;
    }

    public void setItemQty(double itemQty) {
        this.itemQty = itemQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(double discAmt) {
        this.discAmt = discAmt;
    }

    public double getSubAmt() {
        return subAmt;
    }

    public void setSubAmt(double subAmt) {
        this.subAmt = subAmt;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
