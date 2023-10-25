package report.api.models.Inventory;

import java.util.Date;

public class InvTransferCompare {
    private String compCode;
    private String compName;
    private String compImage;
    private String brnCode;
    private String brnName;

    private String brnCodeOut;
    private Date docDateOut;
    private String docNoOut;
    private String brnCodeOutTo;
    private double itemQtyOut;

    private String brnCodeIn;
    private Date docDateIn;
    private String docNoIn;
    private double itemQtyIn;
    private String remark;

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

    public String getBrnCodeOut() {
        return brnCodeOut;
    }

    public void setBrnCodeOut(String brnCodeOut) {
        this.brnCodeOut = brnCodeOut;
    }

    public Date getDocDateOut() {
        return docDateOut;
    }

    public void setDocDateOut(Date docDateOut) {
        this.docDateOut = docDateOut;
    }

    public String getDocNoOut() {
        return docNoOut;
    }

    public void setDocNoOut(String docNoOut) {
        this.docNoOut = docNoOut;
    }

    public double getItemQtyOut() {
        return itemQtyOut;
    }

    public void setItemQtyOut(double itemQtyOut) {
        this.itemQtyOut = itemQtyOut;
    }

    public String getBrnCodeIn() {
        return brnCodeIn;
    }

    public void setBrnCodeIn(String brnCodeIn) {
        this.brnCodeIn = brnCodeIn;
    }

    public Date getDocDateIn() {
        return docDateIn;
    }

    public void setDocDateIn(Date docDateIn) {
        this.docDateIn = docDateIn;
    }

    public String getDocNoIn() {
        return docNoIn;
    }

    public void setDocNoIn(String docNoIn) {
        this.docNoIn = docNoIn;
    }

    public double getItemQtyIn() {
        return itemQtyIn;
    }

    public void setItemQtyIn(double itemQtyIn) {
        this.itemQtyIn = itemQtyIn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getBrnCodeOutTo() {
        return brnCodeOutTo;
    }

    public void setBrnCodeOutTo(String brnCodeOutTo) {
        this.brnCodeOutTo = brnCodeOutTo;
    }

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
    }
}
