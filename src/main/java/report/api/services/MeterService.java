package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Meter.CollectionInputToReport;
import report.api.models.Meter.MeterRepair;
import report.api.models.Meter.MeterTest;
import report.api.models.Meter.RequestGetDataModel;
import report.api.repository.MeterRepository;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MeterService extends BaseService{

    public MeterService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenMeterRepair(RequestGetDataModel dataModel) throws Exception {
        try{
            MeterRepository repo = new MeterRepository(super.env);
            List<MeterRepair> dataset = repo.GetMeterRepair(dataModel);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Meter/MeterRepair.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            //params.put("brnCode", response.getBrnCode());

            //detail
//            CollectionInputToReport collection = new CollectionInputToReport(response);
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenMeterTest(RequestGetDataModel dataModel) throws Exception {
        try{
            MeterRepository repo = new MeterRepository(super.env);
            List<MeterTest> dataset = repo.GetMeterTest(dataModel);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Meter/MeterTest.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            //params.put("brnCode", response.getBrnCode());

            //detail
//            CollectionInputToReport collection = new CollectionInputToReport(response);
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


}
