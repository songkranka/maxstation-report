package report.api.models.Goverment.Collection;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.Goverment.DopPeriod;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {


    private DopPeriod dopPeriod;

//    private JRBeanCollectionDataSource finReceiveDtDataSource;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();

        return dataSources;
    }

    public void setDopPeriod(DopPeriod dopPeriod) {
        this.dopPeriod = dopPeriod;
    }


}
