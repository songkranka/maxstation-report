package report.api.models.Sales;

import java.util.Date;

public class Sale03 {
    private String compCode;
    private String compName;
    private String compImage;
    private String brnCode;
    private String brnName;
    private String docType;
    private String refDocNo;
    private String remark;
    private Date docDate;
    private String docNo;
    private String docStatus;
    private String pdId;
    private String pdName;
    private double itemQty;
    private double unitPrice;
    private double sumItemAmt;
    private double discAmt;
    private double vatAmt;
    private double taxBaseAmt;
    private double subAmt;

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

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
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

    public double getSumItemAmt() {
        return sumItemAmt;
    }

    public void setSumItemAmt(double sumItemAmt) {
        this.sumItemAmt = sumItemAmt;
    }

    public double getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(double discAmt) {
        this.discAmt = discAmt;
    }

    public double getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(double vatAmt) {
        this.vatAmt = vatAmt;
    }

    public double getTaxBaseAmt() {
        return taxBaseAmt;
    }

    public void setTaxBaseAmt(double taxBaseAmt) {
        this.taxBaseAmt = taxBaseAmt;
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

    public double getSubAmt() {
        return subAmt;
    }

    public void setSubAmt(double subAmt) {
        this.subAmt = subAmt;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getRefDocNo() {
        return refDocNo;
    }

    public void setRefDocNo(String refDocNo) {
        this.refDocNo = refDocNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
    }
}
