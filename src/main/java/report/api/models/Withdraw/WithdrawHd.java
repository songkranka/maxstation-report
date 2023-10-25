package report.api.models.Withdraw;

import java.util.Date;
import java.util.List;

public class WithdrawHd {
    private String compCode;
    private String compName;
    private String compNameEn;
    private String compAddress;
    private String compPhone;
    private String compFax;
    private String compImage;
    private String registerId;
    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String branchNo;

    private String docNo;
    private Date docDate;
    private String empCode;
    private String empName;
    private String useBrnCode;
    private String useBrnName;
    private String licensePlate;
    private String reasonDesc;
    private String remark;
    private int itemCount;
    private double totalQty;

    private List<WithdrawDt> items;

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

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
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

    public List<WithdrawDt> getItems() {
        return items;
    }

    public void setItems(List<WithdrawDt> items) {
        this.items = items;
    }

    public String getCompAddress() {
        return compAddress;
    }

    public void setCompAddress(String compAddress) {
        this.compAddress = compAddress;
    }

    public String getCompNameEn() {
        return compNameEn;
    }

    public void setCompNameEn(String compNameEn) {
        this.compNameEn = compNameEn;
    }

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

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getUseBrnCode() {
        return useBrnCode;
    }

    public void setUseBrnCode(String useBrnCode) {
        this.useBrnCode = useBrnCode;
    }

    public String getUseBrnName() {
        return useBrnName;
    }

    public void setUseBrnName(String useBrnName) {
        this.useBrnName = useBrnName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(double totalQty) {
        this.totalQty = totalQty;
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
}
