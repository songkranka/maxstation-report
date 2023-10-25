package report.api.models.Meter;

import java.util.Date;

public class MeterRepair {

    private String compCode;
    private String compName;
    private String compAddress;
    private String registerId;
    private String compImage;

    private String brnCode;
    private String brnName;
    private String brnAddress;

    private Date docDate;
    private int periodNo;
    private String timeStart;
    private String timeFinish;
    private String dispId;
    private String pdName;
    private double repairStart;
    private double repairFinish;
    private double repairQty;
    private double repairAmt;
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

    public String getCompAddress() {
        return compAddress;
    }

    public void setCompAddress(String compAddress) {
        this.compAddress = compAddress;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
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

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public int getPeriodNo() {
        return periodNo;
    }

    public void setPeriodNo(int periodNo) {
        this.periodNo = periodNo;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(String timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getDispId() {
        return dispId;
    }

    public void setDispId(String dispId) {
        this.dispId = dispId;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public double getRepairStart() {
        return repairStart;
    }

    public void setRepairStart(double repairStart) {
        this.repairStart = repairStart;
    }

    public double getRepairFinish() {
        return repairFinish;
    }

    public void setRepairFinish(double repairFinish) {
        this.repairFinish = repairFinish;
    }

    public double getRepairQty() {
        return repairQty;
    }

    public void setRepairQty(double repairQty) {
        this.repairQty = repairQty;
    }

    public double getRepairAmt() {
        return repairAmt;
    }

    public void setRepairAmt(double repairAmt) {
        this.repairAmt = repairAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
