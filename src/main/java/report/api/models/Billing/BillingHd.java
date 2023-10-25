package report.api.models.Billing;

import report.api.models.TaxInvoice.TaxInvoiceItem;

import java.util.Date;
import java.util.List;

public class BillingHd {
    private String docNo;
    private Date docDate;
    private String compCode;
    private String compName;
    private String compAddress;
    private String compPhone;
    private String compFax;
    private String compRegisterId;
    private String compImage;
    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String branchNo;
    private String empName;
    private String custCode;
    private String citizenId;
    private String custName;
    private String custAddress1;
    private String custAddress2;
    private double creditLimit;
    private int creditTerm;
    private String dueType;
    private Date dueDate;
    private int itemCount;
    private String remark;
    private String currency;
    private String curRate;
    private double totalAmt;
    private double totalAmtCur;
    private int countBilling;
    private double sumBilling;
    private Date firstDate;
    private Date lastDate;

    private List<BillingItem> items;

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

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

    public String getCompPhone() {
        return compPhone;
    }

    public void setCompPhone(String compPhone) {
        this.compPhone = compPhone;
    }

    public String getCompFax() {
        return compFax;
    }

    public void setCompFax(String compFax) {
        this.compFax = compFax;
    }

    public String getCompRegisterId() {
        return compRegisterId;
    }

    public void setCompRegisterId(String compRegisterId) {
        this.compRegisterId = compRegisterId;
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

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress1() {
        return custAddress1;
    }

    public void setCustAddress1(String custAddress1) {
        this.custAddress1 = custAddress1;
    }

    public String getCustAddress2() {
        return custAddress2;
    }

    public void setCustAddress2(String custAddress2) {
        this.custAddress2 = custAddress2;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(int creditTerm) {
        this.creditTerm = creditTerm;
    }

    public String getDueType() {
        return dueType;
    }

    public void setDueType(String dueType) {
        this.dueType = dueType;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurRate() {
        return curRate;
    }

    public void setCurRate(String curRate) {
        this.curRate = curRate;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public double getTotalAmtCur() {
        return totalAmtCur;
    }

    public void setTotalAmtCur(double totalAmtCur) {
        this.totalAmtCur = totalAmtCur;
    }

    public int getCountBilling() {
        return countBilling;
    }

    public void setCountBilling(int countBilling) {
        this.countBilling = countBilling;
    }

    public double getSumBilling() {
        return sumBilling;
    }

    public void setSumBilling(double sumBilling) {
        this.sumBilling = sumBilling;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public List<BillingItem> getItems() {
        return items;
    }

    public void setItems(List<BillingItem> items) {
        this.items = items;
    }
}
