package report.api.models.Inventory;

import java.util.Date;

public class InvTransferIn {
    private String compCode;
    private String compName;
    private String compImage;
    private String brnCode;
    private String brnName;

    private String docStatus;
    private Date docDate;
    private String docNo;
    private String brnCodeFrom;
    private String brnNameFrom;
    private String refNo;

    private int seqNo;
    private String pdId;
    private String pdName;
    private String unitName;
    private double itemQty;

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

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
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

    public String getBrnCodeFrom() {
        return brnCodeFrom;
    }

    public void setBrnCodeFrom(String brnCodeFrom) {
        this.brnCodeFrom = brnCodeFrom;
    }

    public String getBrnNameFrom() {
        return brnNameFrom;
    }

    public void setBrnNameFrom(String brnNameFrom) {
        this.brnNameFrom = brnNameFrom;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

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

    public double getItemQty() {
        return itemQty;
    }

    public void setItemQty(double itemQty) {
        this.itemQty = itemQty;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
    }
}
