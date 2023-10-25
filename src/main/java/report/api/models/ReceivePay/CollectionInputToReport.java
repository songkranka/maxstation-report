package report.api.models.ReceivePay;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {

    private FinReceiveHd finReceiveHd;
//    private JRBeanCollectionDataSource finReceiveDtDataSource;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("compName",finReceiveHd.getCompName());
        dataSources.put("compAddress",finReceiveHd.getCompAddress());
        dataSources.put("compPhone",finReceiveHd.getCompPhone());
        dataSources.put("compFax",finReceiveHd.getCompFax());
        dataSources.put("compImage",finReceiveHd.getCompImage());
        dataSources.put("headerName", finReceiveHd.getHeaderName());
        dataSources.put("brnCode", finReceiveHd.getBrnCode());
        dataSources.put("brnName", finReceiveHd.getBrnName());
        dataSources.put("brnAddress", finReceiveHd.getBrnAddress());
        dataSources.put("docNo", finReceiveHd.getDocNo());
        dataSources.put("docDate", finReceiveHd.getDocDate());
        dataSources.put("custCode", finReceiveHd.getCustCode());
        dataSources.put("custName", finReceiveHd.getCustName());
        dataSources.put("custAddr1", finReceiveHd.getCustAddr1());
        dataSources.put("custAddr2", finReceiveHd.getCustAddr2());
        dataSources.put("citizenId", finReceiveHd.getCitizenId());
        dataSources.put("payTypeId", finReceiveHd.getPayTypeId());
        dataSources.put("payDate",finReceiveHd.getPayDate());
        dataSources.put("remark", finReceiveHd.getRemark());
        dataSources.put("totalAmt", finReceiveHd.getTotalAmt());
        dataSources.put("vatAmt", finReceiveHd.getVatAmt());
        dataSources.put("netAmt", finReceiveHd.getNetAmt());
        dataSources.put("netAmtText", finReceiveHd.getNetAmtText());

        dataSources.put("finReceiveDtDataSource1", new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
        dataSources.put("finReceiveDtDataSource2", new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
        return dataSources;
    }

    public FinReceiveHd getFinReceiveHd() {
        return finReceiveHd;
    }

    public void setFinReceiveHd(FinReceiveHd finReceiveHd) {
        this.finReceiveHd = finReceiveHd;
    }
}
