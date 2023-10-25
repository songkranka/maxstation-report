package report.api.models.ReportAudit;

import report.api.models.ReportStock.Stock;

import java.util.List;

public class AuditResponse {
    private String brnCode;
    private String brnName;
    private String compName;
    private String compImage;
    private String docNo;
    private String docDate;

    private double balanceQty;
    private double itemQty;
    private double diffQty;
    private double adjustQty;
    private double sumTotal;
    private double noAdjustQty;

    private List<Audit> audits;

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

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public List<Audit> getAudits() {
        return audits;
    }

    public void setAudits(List<Audit> audits) {
        this.audits = audits;
    }

    public double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public double getItemQty() {
        return itemQty;
    }

    public void setItemQty(double itemQty) {
        this.itemQty = itemQty;
    }

    public double getDiffQty() {
        return diffQty;
    }

    public void setDiffQty(double diffQty) {
        this.diffQty = diffQty;
    }

    public double getAdjustQty() {
        return adjustQty;
    }

    public void setAdjustQty(double adjustQty) {
        this.adjustQty = adjustQty;
    }

    public double getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(double sumTotal) {
        this.sumTotal = sumTotal;
    }

    public double getNoAdjustQty() {
        return noAdjustQty;
    }

    public void setNoAdjustQty(double noAdjustQty) {
        this.noAdjustQty = noAdjustQty;
    }
}
