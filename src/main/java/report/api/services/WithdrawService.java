package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Withdraw.CollectionInputToReport;
import report.api.models.Withdraw.RequestGetDataModel;
import report.api.models.Withdraw.WithdrawHd;
import report.api.repository.WithdrawRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WithdrawService extends BaseService {
    public WithdrawService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenDocument(RequestGetDataModel dataModel) throws Exception {
        try{
            WithdrawRepository repo = new WithdrawRepository(super.env);
            WithdrawHd dataset = repo.GetDocument(dataModel);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Withdraw/Withdraw.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            //params.put("brnCode", response.getBrnCode());

            //detail
            CollectionInputToReport collection = new CollectionInputToReport(dataset);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
