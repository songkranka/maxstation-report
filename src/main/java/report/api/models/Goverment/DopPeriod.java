package report.api.models.Goverment;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.ReceivePay.FinReceiveDt;

import java.util.List;

public class DopPeriod {

    private List<DopPeriodTank> dopPeriodTank;
    private JRBeanCollectionDataSource dopPeriodTankDataSource;

    public List<DopPeriodTank> getDopPeriodTank() {
        return dopPeriodTank;
    }

    public void setDopPeriodTank(List<DopPeriodTank> dopPeriodTank) {
        this.dopPeriodTank = dopPeriodTank;
    }

    public JRBeanCollectionDataSource getDopPeriodTankDataSource() {
//        return dopPeriodTankDataSource;
        return new JRBeanCollectionDataSource(dopPeriodTank, false);
    }

    public void setDopPeriodTankDataSource(JRBeanCollectionDataSource dopPeriodTankDataSource) {
        this.dopPeriodTankDataSource = dopPeriodTankDataSource;
    }

}
