package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import report.api.models.ReportSummaryOilBalance.CollectionInputToReport;
import report.api.models.ReportSummaryOilBalance.RequestGetDataModel;
import report.api.models.ReportSummaryOilBalance.ResponseTankModelForPDF;
import report.api.repository.SummaryOilBalanceRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Service
public class ReportSummaryOilBalanceService extends BaseService {

    public ReportSummaryOilBalanceService(Environment environment) {
        super(environment);
        // TODO Auto-generated constructor stub
    }


//    public JasperPrint GenReport(RequestGetDataModel dataModel) throws Exception {
//        try{
//            SummaryOilBalanceRepository repo = new SummaryOilBalanceRepository(super.env);
//            ResponseTankModelForPDF response = repo.GetData(dataModel);
//
//            //params
//            final InputStream headStream = this.getClass().getResourceAsStream("/reports/ReportSummaryOilBalance/SummaryOil.jrxml");
//            //final InputStream itemStream = this.getClass().getResourceAsStream("/reports/ReportSummaryOilBalance/SummaryOilItems.jrxml");
//
//            JasperReport report = JasperCompileManager.compileReport(headStream);
//            Map<String, Object> params = new HashMap<>();
////            params.put("subReportItem",JasperCompileManager.compileReport(itemStream));
//
//            //detail
//            CollectionInputToReport collection = new CollectionInputToReport(response);
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
//            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
//            return print;
//        }catch (Exception ex){
//            throw new Exception(ex.getMessage());
//        }
//    }

    public JasperPrint GenReport(RequestGetDataModel request) throws Exception {
        try{
            SummaryOilBalanceRepository repo = new SummaryOilBalanceRepository(super.env);
            ResponseTankModelForPDF response = repo.GetData(request);

            //params
            final InputStream stream = this.getClass().getResourceAsStream("/reports/ReportSummaryOilBalance/ReportSummaryOilBalance.jrxml");
            JasperReport report = JasperCompileManager.compileReport(stream);
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.getCompCode());
            params.put("brnCode", request.getBrnCode());
            params.put("docDate", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.getDocDate()));

            //detail
            CollectionInputToReport collection = new CollectionInputToReport(response);
            //JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(response.getTankData());
            //collection.setHdTankModelForPDFDataSource(source);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


}
