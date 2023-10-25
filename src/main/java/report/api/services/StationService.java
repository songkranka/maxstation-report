package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import report.api.models.Station.*;
import report.api.models.Station.Collection.CollectionST312;
import report.api.repository.InventoryRepository;
import report.api.repository.StationRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Service
public class StationService  extends BaseService  {
    public StationService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenReportST312(RequestDataModel dataModel) throws Exception {
        try{
            StationRepository repo = new StationRepository(super.env);
            CashierModel cashierModel = repo.GetST312(dataModel);

            String jrxml = "/reports/ReportStation/CashierDiff.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
//            params.put("brnCode", dataModel.BrnCode);
//            params.put("brnName","ทดสอบ");


            //detail
            CollectionST312 collectionInputToReport = new CollectionST312();

            //collectionInputToReport.setFinReceiveHd(cashierModel);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));


            //---------------------------------------//
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    public JasperPrint GenReportST313(RequestDataModel request) throws Exception {
        try{
            StationRepository repo = new StationRepository(super.env);
            List<ST313> dataset = repo.GetST313(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Station/ST313.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            //detail
            //CollectionInputToReport collection = new CollectionInputToReport(dataset);
            //JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    public JasperPrint GenReportST315(RequestDataModel dataModel) throws Exception {
        try{
            StationRepository repo = new StationRepository(super.env);
            List<ST315> dataset = repo.GetST315(dataModel);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Station/ST315.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(dataModel.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(dataModel.DateTo));

            //detail
            //CollectionInputToReport collection = new CollectionInputToReport(dataset);
            //JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    public JasperPrint GenReportST316(RequestDataModel dataModel) throws Exception {
        try{
            StationRepository repo = new StationRepository(super.env);
            List<ST316> dataset = repo.GetST316(dataModel);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Station/ST316.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(dataModel.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(dataModel.DateTo));

            //detail
            //CollectionInputToReport collection = new CollectionInputToReport(dataset);
            //JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenReportST317(RequestDataModel request) throws Exception {
        try{
            StationRepository repo = new StationRepository(super.env);
            List<ST317> dataset = repo.GetST317(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Station/ST317.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            //detail
            //CollectionInputToReport collection = new CollectionInputToReport(dataset);
            //JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }





}
