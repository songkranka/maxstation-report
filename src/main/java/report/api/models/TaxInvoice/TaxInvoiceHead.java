package report.api.models.TaxInvoice;

import report.api.models.ReceivePay.FinReceiveDt;

import java.util.Date;
import java.util.List;

public class TaxInvoiceHead {
    private String docType;
    private String docNo;
    private Date docDate;
    private String empName;
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
    private String sapCustCode;
    private String ref2;

    private String custCode;
    private String custName;
    private String custAddress1;
    private String custAddress2;
    private String custCitizenId;
    private String refDocNo;
    private double taxBaseAmt;
    private double taxBaseAmtHd;
    private double vatAmt;
    private double subAmt;
    private double netAmt;
    private String netAmtText;
    private String licensePlate;

    private List<TaxInvoiceItem> items;

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


    public List<TaxInvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<TaxInvoiceItem> items) {
        this.items = items;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
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


    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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

    public String getCustCitizenId() {
        return custCitizenId;
    }

    public void setCustCitizenId(String custCitizenId) {
        this.custCitizenId = custCitizenId;
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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getTaxBaseAmt() {
        return taxBaseAmt;
    }

    public void setTaxBaseAmt(double taxBaseAmt) {
        this.taxBaseAmt = taxBaseAmt;
    }

    public double getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(double vatAmt) {
        this.vatAmt = vatAmt;
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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getTaxBaseAmtHd() {
        return taxBaseAmtHd;
    }

    public void setTaxBaseAmtHd(double taxBaseAmtHd) {
        this.taxBaseAmtHd = taxBaseAmtHd;
    }

    public String getSapCustCode() {
        return sapCustCode;
    }

    public void setSapCustCode(String sapCustCode) {
        this.sapCustCode = sapCustCode;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }
}
