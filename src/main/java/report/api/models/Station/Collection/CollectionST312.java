package report.api.models.Station.Collection;

import report.api.models.Station.CashierModel;

import java.util.HashMap;
import java.util.Map;

public class CollectionST312 {

    private CashierModel cashierModel;

    public CashierModel getCashierModel() {
        return cashierModel;
    }

    public void setCashierModel(CashierModel cashierModel) {
        this.cashierModel = cashierModel;
    }

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("compCode", cashierModel.getCompCode());
        dataSources.put("compName", cashierModel.getCompName());
        dataSources.put("brnCode", cashierModel.getBrnCode());
        dataSources.put("brnName", cashierModel.getBrnName());

//        dataSources.put("brnAddress", finReceiveHd.getBrnAddress());
//        dataSources.put("docNo", finReceiveHd.getDocNo());
//        dataSources.put("docDate", finReceiveHd.getDocDate());
//        dataSources.put("custCode", finReceiveHd.getCustCode());
//        dataSources.put("custName", finReceiveHd.getCustName());
//        dataSources.put("custAddr1", finReceiveHd.getCustAddr1());
//        dataSources.put("custAddr2", finReceiveHd.getCustAddr2());
//        dataSources.put("payTypeId", finReceiveHd.getPayTypeId());
//        dataSources.put("remark", finReceiveHd.getRemark());
//        dataSources.put("totalAmt", finReceiveHd.getTotalAmt());
//        dataSources.put("vatAmt", finReceiveHd.getVatAmt());
//        dataSources.put("netAmt", finReceiveHd.getNetAmt());
//        dataSources.put("netAmtText", finReceiveHd.getNetAmtText());
//
//        dataSources.put("finReceiveDtDataSource1", new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
//        dataSources.put("finReceiveDtDataSource2", new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
        return dataSources;
    }

}
