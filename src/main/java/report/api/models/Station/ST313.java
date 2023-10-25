package report.api.models.Station;

import java.util.Date;

public class ST313 {
    private String compCode;
    private String compName;
    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String branchNo;

    private Date docDate;
    private double saleQty;
    private double saleAmt;
    private double creditAmt;
    private double cashAmt;
    private double cashReceiveAmt;
    private double cashPaymentAmt;
    private double diffAmt;
    private double totalAmt;

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

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

    public String getBrnAddress() {
        return brnAddress;
    }

    public void setBrnAddress(String brnAddress) {
        this.brnAddress = brnAddress;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public double getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(double saleQty) {
        this.saleQty = saleQty;
    }

    public double getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(double saleAmt) {
        this.saleAmt = saleAmt;
    }

    public double getCreditAmt() {
        return creditAmt;
    }

    public void setCreditAmt(double creditAmt) {
        this.creditAmt = creditAmt;
    }

    public double getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(double cashAmt) {
        this.cashAmt = cashAmt;
    }

    public double getCashReceiveAmt() {
        return cashReceiveAmt;
    }

    public void setCashReceiveAmt(double cashReceiveAmt) {
        this.cashReceiveAmt = cashReceiveAmt;
    }

    public double getCashPaymentAmt() {
        return cashPaymentAmt;
    }

    public void setCashPaymentAmt(double cashPaymentAmt) {
        this.cashPaymentAmt = cashPaymentAmt;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public double getDiffAmt() {
        return diffAmt;
    }

    public void setDiffAmt(double diffAmt) {
        this.diffAmt = diffAmt;
    }
}
