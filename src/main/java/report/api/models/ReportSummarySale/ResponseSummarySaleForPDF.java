package report.api.models.ReportSummarySale;

import java.util.Date;
import java.util.List;

public class ResponseSummarySaleForPDF {
    private String brnCode;
    private String brnName;
    private Date docDate;
    private String compName;
    private String compImage;
    private String empName;
    private double totalQty;
    private double totalAmt;
    private double totalCashAmt;
    private double totalDiffAmt;
    private double totalDepositAmt;

    private List<HeaderSummarySaleForPDF> headerSummarySale;
    private List<DispOfSummerySaleForPDF> bodyLeftItems;
    private List<BodyRightItemForPDF> bodyRightItems;
    private List<SumGlForPDF> crItems;
    private List<SumGlForPDF> drItems;

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

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public List<DispOfSummerySaleForPDF> getBodyLeftItems() {
        return bodyLeftItems;
    }

    public void setBodyLeftItems(List<DispOfSummerySaleForPDF> bodyLeftItems) {
        this.bodyLeftItems = bodyLeftItems;
    }

    public List<BodyRightItemForPDF> getBodyRightItems() {
        return bodyRightItems;
    }

    public void setBodyRightItems(List<BodyRightItemForPDF> bodyRightItems) {
        this.bodyRightItems = bodyRightItems;
    }

    public List<SumGlForPDF> getCrItems() {
        return crItems;
    }

    public void setCrItems(List<SumGlForPDF> crItems) {
        this.crItems = crItems;
    }

    public List<SumGlForPDF> getDrItems() {
        return drItems;
    }

    public void setDrItems(List<SumGlForPDF> drItems) {
        this.drItems = drItems;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public String getCompImage() {
        return compImage;
    }

    public void setCompImage(String compImage) {
        this.compImage = compImage;
    }

    public double getTotalCashAmt() {
        return totalCashAmt;
    }

    public void setTotalCashAmt(double totalCashAmt) {
        this.totalCashAmt = totalCashAmt;
    }

    public double getTotalDiffAmt() {
        return totalDiffAmt;
    }

    public void setTotalDiffAmt(double totalDiffAmt) {
        this.totalDiffAmt = totalDiffAmt;
    }

    public double getTotalDepositAmt() {
        return totalDepositAmt;
    }

    public void setTotalDepositAmt(double totalDepositAmt) {
        this.totalDepositAmt = totalDepositAmt;
    }

    public List<HeaderSummarySaleForPDF> getHeaderSummarySale() {
        return headerSummarySale;
    }

    public void setHeaderSummarySale(List<HeaderSummarySaleForPDF> headerSummarySale) {
        this.headerSummarySale = headerSummarySale;
    }
}
