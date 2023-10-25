package report.api.models.Goverment.Collection;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.Goverment.Gov03;

import java.util.HashMap;
import java.util.Map;

public class CollectionMapGov03 {
    private Gov03 gov03;

    public CollectionMapGov03(Gov03 dataset) {
        gov03 = dataset;
    }


    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("compCode",gov03.getCompCode());
        dataSources.put("compName",gov03.getCompName());
        dataSources.put("registerId",gov03.getRegisterId());
        dataSources.put("brnCode",gov03.getBrnCode());
        dataSources.put("brnName",gov03.getBrnName());
        dataSources.put("brnAddress",gov03.getBrnAddress());
        dataSources.put("branchNo",gov03.getBranchNo());
        dataSources.put("monthName",gov03.getMonthName());
        dataSources.put("year",gov03.getYear());

        dataSources.put("tanks", new JRBeanCollectionDataSource(gov03.getTanks()));
        dataSources.put("summaries", new JRBeanCollectionDataSource(gov03.getSummaries()));
        return dataSources;
    }
}
