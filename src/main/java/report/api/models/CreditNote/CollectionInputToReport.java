package report.api.models.CreditNote;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.Billing.BillingHd;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {

    private CreditNoteHd head;
//    private JRBeanCollectionDataSource finReceiveDtDataSource;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();

        dataSources.put("docNo", head.getDocNo());
        dataSources.put("docDate", head.getDocDate());
        dataSources.put("empName", head.getEmpName());


        dataSources.put("compName", head.compName());
        dataSources.put("compAddress", head.getCompAddress());
        dataSources.put("compPhone", head.getCompPhone());
        dataSources.put("compFax", head.getCompFax());
        dataSources.put("compRegisterId", head.getCompRegisterId());
        dataSources.put("compImage", head.getCompImage());

        dataSources.put("brnCode", head.getBrnCode());
        dataSources.put("brnName", head.getBrnName());
        dataSources.put("brnAddress", head.getBrnAddress());
        dataSources.put("branchNo", head.getBranchNo());

        dataSources.put("custCode", head.getCustCode());
        dataSources.put("custName", head.getCustName());
        dataSources.put("custAddress1", head.getCustAddr1());
        dataSources.put("custAddress2", head.getCustAddr2());
        dataSources.put("custCitizenId", head.getCitizenId());
        dataSources.put("txNo", head.getTxNo());
        dataSources.put("reasonDesc", head.getReasonDesc());

        dataSources.put("vatAmt", head.getVatAmt());
        dataSources.put("subAmt", head.getSubAmt());
        dataSources.put("netAmt", head.getNetAmt());
        dataSources.put("netAmtText", head.getNetAmtText());
        dataSources.put("docType", head.getDocType());
        dataSources.put("taxInvoiceDate", head.getTaxInvoiceDocDate());

        dataSources.put("items", new JRBeanCollectionDataSource(head.getItems()));
        return dataSources;
    }

    public CreditNoteHd getCreditNoteHd() {
        return head;
    }

    public void setCreditNoteHd(CreditNoteHd creditNoteHd) {
        this.head = creditNoteHd;
    }

}
