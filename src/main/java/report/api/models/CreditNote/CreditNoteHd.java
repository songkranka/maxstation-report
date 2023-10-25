package report.api.models.CreditNote;

import report.api.models.Billing.BillingItem;

import java.util.Date;
import java.util.List;

public class CreditNoteHd {
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
    private String empCode;
    private String empName;

    private String docNo;
    private Date docDate;
    private String txNo;
    private String reasonDesc;
    private String custCode;
    private String custName;
    private String custAddr1;
    private String custAddr2;
    private String citizenId;
    private double subAmt;
    private double vatAmt;
    private double netAmt;
    private String netAmtText;
    private String docType;
    private Date taxInvoiceDocDate;
    private List<CreditNoteDt> items;


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

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddr1() {
        return custAddr1;
    }

    public void setCustAddr1(String custAddr1) {
        this.custAddr1 = custAddr1;
    }

    public String getCustAddr2() {
        return custAddr2;
    }

    public void setCustAddr2(String custAddr2) {
        this.custAddr2 = custAddr2;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public double getSubAmt() {
        return subAmt;
    }

    public void setSubAmt(double subAmt) {
        this.subAmt = subAmt;
    }

    public double getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(double vatAmt) {
        this.vatAmt = vatAmt;
    }

    public double getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(double netAmt) {
        this.netAmt = netAmt;
    }

    public String getNetAmtText() {
        return netAmtText;
    }

    public void setNetAmtText(String netAmtText) {
        this.netAmtText = netAmtText;
    }

    public List<CreditNoteDt> getItems() {
        return items;
    }

    public void setItems(List<CreditNoteDt> items) {
        this.items = items;
    }

    public String compName() {
        return compName;
    }

    public void compName(String compNme) {
        this.compName = compNme;
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

    public String getTxNo() {
        return txNo;
    }

    public void setTxNo(String txNo) {
        this.txNo = txNo;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Date getTaxInvoiceDocDate() {
        return taxInvoiceDocDate;
    }

    public void setTaxInvoiceDocDate(Date taxInvoiceDocDate) {
        this.taxInvoiceDocDate = taxInvoiceDocDate;
    }
}
