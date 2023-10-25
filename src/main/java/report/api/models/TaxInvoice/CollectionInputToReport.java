package report.api.models.TaxInvoice;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.ReceivePay.FinReceiveHd;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {

    private TaxInvoiceHead head;
//    private JRBeanCollectionDataSource finReceiveDtDataSource;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();
        dataSources.put("docType", head.getDocType());
        dataSources.put("docNo", head.getDocNo());
        dataSources.put("docDate", head.getDocDate());
        dataSources.put("empName", head.getEmpName());

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
        dataSources.put("sapCustCode",head.getSapCustCode());
        dataSources.put("ref2",head.getRef2());

        dataSources.put("custCode", head.getCustCode());
        dataSources.put("custName", head.getCustName());
        dataSources.put("custAddress1", head.getCustAddress1());
        dataSources.put("custAddress2", head.getCustAddress2());
        dataSources.put("custCitizenId", head.getCustCitizenId());
        dataSources.put("refDocNo", head.getRefDocNo());

        dataSources.put("taxBaseAmt", head.getTaxBaseAmt());
        dataSources.put("taxBaseAmtHd", head.getTaxBaseAmtHd());
        dataSources.put("vatAmt", head.getVatAmt());
        dataSources.put("subAmt", head.getSubAmt());

        dataSources.put("netAmt", head.getNetAmt());
        dataSources.put("netAmtText", head.getNetAmtText());
        dataSources.put("licensePlate", head.getLicensePlate());

        dataSources.put("items", new JRBeanCollectionDataSource(head.getItems()));
        return dataSources;
    }

    public TaxInvoiceHead getTaxInvoiceHead() {
        return head;
    }

    public void setTaxInvoiceHead(TaxInvoiceHead taxInvoiceHd) {
        this.head = taxInvoiceHd;
    }
}
