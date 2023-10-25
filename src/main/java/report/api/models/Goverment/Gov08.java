package report.api.models.Goverment;


import java.util.Date;

public class Gov08 {
    private String compCode;
    private String compName;
    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String branchNo;

    private String month;
    private String year;

    private int seqNo;
    private Date docDate;
    private String pdId;
    private String pdName;
    //private String invNo;
    private double balanceQty;
    private double receiveQty;
    private double saleQty;
    private double adjustQty;
    private double remainQty;
    private double sumYearReceiveQty;
    private double sumYearSaleQty;
    private double subYearAdjustQty;

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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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

    public double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public double getReceiveQty() {
        return receiveQty;
    }

    public void setReceiveQty(double receiveQty) {
        this.receiveQty = receiveQty;
    }

    public double getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(double saleQty) {
        this.saleQty = saleQty;
    }

    public double getAdjustQty() {
        return adjustQty;
    }

    public void setAdjustQty(double adjustQty) {
        this.adjustQty = adjustQty;
    }

    public double getRemainQty() {
        return remainQty;
    }

    public void setRemainQty(double remainQty) {
        this.remainQty = remainQty;
    }

    public double getSumYearReceiveQty() {
        return sumYearReceiveQty;
    }

    public void setSumYearReceiveQty(double sumYearReceiveQty) {
        this.sumYearReceiveQty = sumYearReceiveQty;
    }

    public double getSumYearSaleQty() {
        return sumYearSaleQty;
    }

    public void setSumYearSaleQty(double sumYearSaleQty) {
        this.sumYearSaleQty = sumYearSaleQty;
    }

    public double getSubYearAdjustQty() {
        return subYearAdjustQty;
    }

    public void setSubYearAdjustQty(double subYearAdjustQty) {
        this.subYearAdjustQty = subYearAdjustQty;
    }

}
