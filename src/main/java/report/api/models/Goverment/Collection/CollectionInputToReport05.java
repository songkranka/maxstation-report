package report.api.models.Goverment.Collection;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.Goverment.GOV05;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport05 {
    private GOV05 gov05;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();

        dataSources.put("brnCode",gov05.getBrnCode());
        dataSources.put("brnName",gov05.getBrnName());
        dataSources.put("brnAddress",gov05.getBrnAddress());
        dataSources.put("branchNo",gov05.getBranchNo());
        dataSources.put("compName",gov05.getCompName());
        dataSources.put("month",gov05.getMonth());
        dataSources.put("year",gov05.getYear());

        return dataSources;
    }

    public GOV05 getGov05() {
        return gov05;
    }

    public void setGov05(GOV05 gov05) {
        this.gov05 = gov05;
    }
}
