package report.api.models.ReportAudit;

public class AuditDetail {
    private int seqNo;
    private String productId;
    private String productName;
    private double productPrice;
    private String productGroupId;
    private String productGroupName;
    private double balanceQty;
    private double sumBanlanceQty;
    private double itemQty;
    private double sumItemQty;
    private double diffQty;
    private double sumDiffQty;
    private double adjustQty;
    private double sumAdjustQty;
    private double noAdjustQty;
    private double sumNoAdjustQty;
    private double total;
    private double sumTotal;

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductGroupId() {
        return productGroupId;
    }
    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductGroupName() {
        return productGroupName;
    }
    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public double getBalanceQty() {
        return balanceQty;
    }
    public void setBalanceQty(int balanceQty) {
        this.balanceQty = balanceQty;
    }

    public double getSumBanlanceQty() {
        return sumBanlanceQty;
    }
    public void setSumBanlanceQty(int sumBanlanceQty) {
        this.sumBanlanceQty = sumBanlanceQty;
    }

    public double getItemQty() {
        return itemQty;
    }
    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public double getSumItemQty() {
        return sumItemQty;
    }
    public void setSumItemQty(int sumItemQty) {
        this.sumItemQty = sumItemQty;
    }

    public double getDiffQty() {
        return diffQty;
    }
    public void setDiffQty(int diffQty) {
        this.diffQty = diffQty;
    }

    public double getSumDiffQty() {
        return sumDiffQty;
    }
    public void setSumDiffQty(int sumDiffQty) {
        this.sumDiffQty = sumDiffQty;
    }

    public double getAdjustQty() {
        return adjustQty;
    }
    public void setAdjustQty(int adjustQty) {
        this.adjustQty = adjustQty;
    }

    public double getSumAdjustQty() {
        return sumAdjustQty;
    }
    public void setSumAdjustQty(int sumAdjustQty) {
        this.sumAdjustQty = sumAdjustQty;
    }

    public double getNoAdjustQty() {
        return noAdjustQty;
    }
    public void setNoAdjustQty(int noAdjustQty) {
        this.noAdjustQty = noAdjustQty;
    }

    public double getSumNoAdjustQty() {
        return sumNoAdjustQty;
    }
    public void setSumNoAdjustQty(int sumNoAdjustQty) {
        this.sumNoAdjustQty = sumNoAdjustQty;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public double getSumTotal() {
        return sumTotal;
    }
    public void setSumTotal(double sumTotal) {
        this.sumTotal = sumTotal;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }
}
