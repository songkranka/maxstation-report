package report.api.models.VatSale;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import report.api.models.ReceivePay.FinReceiveHd;

import java.util.HashMap;
import java.util.Map;

public class CollectionInputToReport {

    private VatSale vatSale;

    public Map<String, Object> getMapDataSource() {
        Map<String,Object> dataSources = new HashMap<>();

        dataSources.put("brnCode",vatSale.getBrnCode());
        dataSources.put("brnName",vatSale.getBrnName());
        dataSources.put("branchNo",vatSale.getBranchNo());
        dataSources.put("companyName",vatSale.getCompanyName());
        dataSources.put("registerId",vatSale.getRegisterId());
//        dataSources.put("finReceiveDtDataSource1", new JRBeanCollectionDataSource(vatSale));
        return dataSources;
    }


    public VatSale getVatSale() {
        return vatSale;
    }

    public void setVatSale(VatSale vatSale) {
        this.vatSale = vatSale;
    }
}
