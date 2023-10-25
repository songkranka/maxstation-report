package report.api.models.ReportSummaryOilBalance;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

public class HdTankModelForPDF {
    private int period;
    private List<DtTankModelForPDF> dtItems;

    private JRBeanCollectionDataSource dtTankModelForPDFDataSource;

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public List<DtTankModelForPDF> getDtItems() {
        return dtItems;
    }

    public void setDtItems(List<DtTankModelForPDF> dtItems) {
        this.dtItems = dtItems;
    }

    public JRBeanCollectionDataSource getDtTankModelForPDFDataSource() {
        return new JRBeanCollectionDataSource(dtItems, false);
    }
}
