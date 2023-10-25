package report.api.models.ReceivePay;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.ReportStock.Stock;

import java.util.Date;
import java.util.List;

public class FinReceiveHd {
    private String compName;
    private String compAddress;
    private String compPhone;
    private String compFax;
    private String compImage;
    private String headerName;
    private String brnCode;
    private String brnName;
    private String brnAddress;
    private String docNo;
    private String docDate;
    private String custCode;
    private String custName;
    private String custAddr1;
    private String custAddr2;
    private String citizenId;
    private String receiveTypeId;
    private String receiveType;
    private String payTypeId;
    private String payType;
    private String payDate;
    private String bankNo;
    private String bankName;
    private String accountNo;
    private String payNo;
    private String remark;
    private double totalAmt;
    private double vatAmt;
    private double netAmt;
    private String netAmtText;
    private List<FinReceiveDt> finReceivePayDt;
    private JRBeanCollectionDataSource finReceiveDtDataSource;
    /*------initial------*/


    public FinReceiveHd() {
    }

    public String getBrnCode() {
        return brnCode;
    }

    public void setBrnCode(String brnCode) {
        this.brnCode = brnCode;
    }

    public String getBrnName() { return this.brnName; }

    public void setBrnName(String brnName) {
        this.brnName = brnName;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
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

    public String getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(String payTypeId) {
        this.payTypeId = payTypeId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public void setFinReceivePayDt(List<FinReceiveDt> finReceivePayDt) {
        this.finReceivePayDt = finReceivePayDt;
    }
    public List<FinReceiveDt> getFinReceivePayDt() {
        return this.finReceivePayDt;
    }

    public JRBeanCollectionDataSource getFinReceiveDtDataSource() {
//        return finReceiveDtDataSource;
        return new JRBeanCollectionDataSource(finReceivePayDt, false);
    }


    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getBrnAddress() {
        return brnAddress;
    }

    public void setBrnAddress(String brnAddress) {
        this.brnAddress = brnAddress;
    }

    public String getReceiveTypeId() {
        return receiveTypeId;
    }

    public void setReceiveTypeId(String receiveTypeId) {
        this.receiveTypeId = receiveTypeId;
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public double getVatAmt() {
        return vatAmt;
    }

    public void setVatAmt(double vatAmt) {
        this.vatAmt = vatAmt;
    }

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
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
}
