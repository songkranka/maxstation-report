package report.api.models.Meter;

import report.api.models.TaxInvoice.TaxInvoiceItem;

import java.util.Date;
import java.util.List;

public class MeterTest {

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
    private double meterStart;
    private double meterFinish;
    private double testQty;
    private double testAmt;
    private double totalQty;
    private double totalAmt;
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


    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
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

    public double getMeterStart() {
        return meterStart;
    }

    public void setMeterStart(double meterStart) {
        this.meterStart = meterStart;
    }

    public double getMeterFinish() {
        return meterFinish;
    }

    public void setMeterFinish(double meterFinish) {
        this.meterFinish = meterFinish;
    }

    public double getTestQty() {
        return testQty;
    }

    public void setTestQty(double testQty) {
        this.testQty = testQty;
    }

    public double getTestAmt() {
        return testAmt;
    }

    public void setTestAmt(double testAmt) {
        this.testAmt = testAmt;
    }

    public double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(double totalQty) {
        this.totalQty = totalQty;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }
}
