package report.api.models.ReportSummarySale;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.env.Environment;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    public CollectionInputToReport(ResponseSummarySaleForPDF _resp) {
        response = _resp;
    }
    private ResponseSummarySaleForPDF response;

    private String compName;
    private String compImage;
    private Date docDate;
    private String empName;
    private double totalQty;
    private double totalAmt;
    private double totalCashAmt;
    private double totalDiffAmt;
    private double totalDepositAmt;

    private JRBeanCollectionDataSource headerSummerySale;
    private JRBeanCollectionDataSource bodyLeftItemsDataSource;
    private JRBeanCollectionDataSource bodyRightItemsDataSource;
    private JRBeanCollectionDataSource crItemsDataSource;
    private JRBeanCollectionDataSource drItemsDataSource;

    public void setBodyLeftItemsDataSource(JRBeanCollectionDataSource bodyLeftItemsDataSource) {
        this.bodyLeftItemsDataSource = bodyLeftItemsDataSource;
    }

    public void setBodyRightItemsDataSource(JRBeanCollectionDataSource bodyRightItemsDataSource) {
        this.bodyRightItemsDataSource = bodyRightItemsDataSource;
    }

    public void setCrItemsDataSource(JRBeanCollectionDataSource crItemsDataSource) {
        this.crItemsDataSource = crItemsDataSource;
    }

    public void setDrItemsDataSource(JRBeanCollectionDataSource drItemsDataSource) {
        this.drItemsDataSource = drItemsDataSource;
    }

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("brnCode", response.getBrnCode());
        dataSources.put("compName", response.getCompName());
        dataSources.put("compImage", response.getCompImage());

        dataSources.put("docDate", response.getDocDate());
        dataSources.put("empName", response.getEmpName());
        dataSources.put("totalQty",response.getTotalQty());
        dataSources.put("totalAmt", response.getTotalAmt());
        dataSources.put("totalCashAmt", response.getTotalCashAmt());
        dataSources.put("totalDiffAmt", response.getTotalDiffAmt());
        dataSources.put("totalDepositAmt", response.getTotalDepositAmt());

        dataSources.put("headerDataSource", new JRBeanCollectionDataSource(response.getHeaderSummarySale()));
        dataSources.put("bodyLeftItemsDataSource", new JRBeanCollectionDataSource(response.getBodyLeftItems()));
        dataSources.put("bodyRightItemsDataSource",new JRBeanCollectionDataSource(response.getBodyRightItems()));
        dataSources.put("crItemsDataSource", new JRBeanCollectionDataSource(response.getCrItems()));
        dataSources.put("drItemsDataSource", new JRBeanCollectionDataSource(response.getDrItems()));
        return dataSources;
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

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
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
}
