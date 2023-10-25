package report.api.models.Withdraw;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    /*constructor*/
    public CollectionInputToReport(WithdrawHd _resp) {
        response = _resp;
    }
    private final WithdrawHd response;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("compName", response.getCompName());
        dataSources.put("compNameEn", response.getCompNameEn());
        dataSources.put("compAddress", response.getCompAddress());
        dataSources.put("compPhone", response.getCompPhone());
        dataSources.put("compFax", response.getCompFax());
        dataSources.put("compImage", response.getCompImage());
        dataSources.put("registerId", response.getRegisterId());

        dataSources.put("brnCode", response.getBrnCode());
        dataSources.put("brnName", response.getBrnName());
        dataSources.put("brnAddress", response.getBrnAddress());

        dataSources.put("docNo", response.getDocNo());
        dataSources.put("docDate", response.getDocDate());
        dataSources.put("empName", response.getEmpName());
        dataSources.put("useBrnName", response.getUseBrnName());
        dataSources.put("licensePlate", response.getLicensePlate());
        dataSources.put("reasonDesc", response.getReasonDesc());
        dataSources.put("remark", response.getRemark());
        dataSources.put("totalQty", response.getTotalQty());
        dataSources.put("itemCount", response.getItemCount());

        dataSources.put("itemsDataSource", new JRBeanCollectionDataSource(response.getItems()));

        return dataSources;
    }

}
