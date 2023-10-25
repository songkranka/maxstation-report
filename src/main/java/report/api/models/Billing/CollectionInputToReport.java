package report.api.models.Billing;


import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {
    private BillingHd head;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("docNo", head.getDocNo());
        dataSources.put("docDate", head.getDocDate());
        dataSources.put("compCode", head.getCompCode());
        dataSources.put("compName", head.getCompName());
        dataSources.put("compAddress", head.getCompAddress());
        dataSources.put("compPhone", head.getCompPhone());
        dataSources.put("compFax", head.getCompFax());
        dataSources.put("compRegisterId", head.getCompRegisterId());
        dataSources.put("compImage", head.getCompImage());
        dataSources.put("brnCode", head.getBrnCode());
        dataSources.put("brnName", head.getBrnName());
        dataSources.put("brnAddress", head.getBrnAddress());
        dataSources.put("branchNo", head.getBranchNo());
        dataSources.put("empName", head.getEmpName());
        dataSources.put("custCode", head.getCustCode());
        dataSources.put("citizenId", head.getCitizenId());
        dataSources.put("custName", head.getCustName());
        dataSources.put("custAddress1", head.getCustAddress1());
        dataSources.put("custAddress2", head.getCustAddress2());
        dataSources.put("creditLimit", head.getCreditLimit());
        dataSources.put("creditTerm", head.getCreditTerm());
        dataSources.put("dueType", head.getDueType());
        dataSources.put("dueDate", head.getDueDate());
        dataSources.put("itemCount", head.getItemCount());
        dataSources.put("remark", head.getRemark());
        dataSources.put("currency", head.getCurrency());
        dataSources.put("curRate", head.getCurRate());
        dataSources.put("totalAmt", head.getTotalAmt());
        dataSources.put("totalAmtCur", head.getTotalAmtCur());
        dataSources.put("countBilling", head.getCountBilling());
        dataSources.put("sumBilling", head.getSumBilling());
        dataSources.put("firstDate", head.getFirstDate());
        dataSources.put("lastDate", head.getLastDate());

        dataSources.put("items", new JRBeanCollectionDataSource(head.getItems()));
        return dataSources;
    }

    public BillingHd getBillingHd() {
        return head;
    }

    public void setBillingHd(BillingHd billingHd) {
        this.head = billingHd;
    }
}
