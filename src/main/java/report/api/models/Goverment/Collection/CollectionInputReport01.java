package report.api.models.Goverment.Collection;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.Goverment.Gov01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionInputReport01 {
    private Gov01 gov01;

    public CollectionInputReport01(Gov01 dataset) {
        gov01 = dataset;
    }


    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("compCode",gov01.getCompCode());
        dataSources.put("compName",gov01.getCompName());

        dataSources.put("brnCode",gov01.getBrnCode());
        dataSources.put("brnName",gov01.getBrnName());
        dataSources.put("brnAddress",gov01.getBrnAddress());
        dataSources.put("branchNo",gov01.getBranchNo());

        dataSources.put("docDates", new JRBeanCollectionDataSource(gov01.getDocDates()));
        dataSources.put("diffs", new JRBeanCollectionDataSource(gov01.getDiffs()));
        dataSources.put("summaries", new JRBeanCollectionDataSource(gov01.getSummaries()));
        return dataSources;
    }

}
