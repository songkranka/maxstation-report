package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Goverment.*;
import report.api.models.Goverment.Collection.CollectionInputReport01;
import report.api.models.Goverment.Collection.CollectionMapReportGov11;
import report.api.models.Goverment.Collection.CollectionMapGov03;
import report.api.repository.GovermentRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class GovermentService extends BaseService{
    public GovermentService(Environment environment) {
        super(environment);
    }

    public  String GetUrlApi(){
        return super.config.getUrlApi();
    }



    public JasperPrint GenReportGov01(RequestDataModel request) throws Exception {
        try{
            GovermentRepository repo = new GovermentRepository(super.env);
            Gov01 dataset = repo.GetData01(request);

            final InputStream stream = this.getClass().getResourceAsStream("/reports/Goverment/Gov01.jrxml");
            final InputStream hdStream = this.getClass().getResourceAsStream("/reports/Goverment/Gov01Head.jrxml");

            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.CompCode);
            params.put("brnCode", request.BrnCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateTo));
            params.put("subReportHead",JasperCompileManager.compileReport(hdStream));


            //detail
            CollectionInputReport01 collection = new CollectionInputReport01(dataset);
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});

            //---------------------------------------//
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


//    public JasperPrint GenReportGov02(RequestGetDataModel request) throws Exception {
//        try{
//            GovermentRepository repo = new GovermentRepository(super.env);
//            List<GOV01> dataset = repo.GetData02(request);
//
//            String jrxml = "/reports/Goverment/gov_02.jrxml";
//            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
//            JasperReport report = JasperCompileManager.compileReport(stream);
//
//            //params
//            Map<String, Object> params = new HashMap<>();
//            params.put("brnCode", request.BrnCode);
//            params.put("brnCode", request.CompCode);
//            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateFrom));
//            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateTo));
//
//            //detail
//            //CollectionInputToReport collectionInputToReport = new CollectionInputToReport();
//
//            //collectionInputToReport.setFinReceiveHd(finReceiveHd);
//            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
//
//
//            //---------------------------------------//
////            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
//            JasperPrint print = JasperFillManager.fillReport(stream, params, dataSource);
//            return print;
//        }catch (Exception ex){
//            throw new Exception(ex.getMessage());
//        }
//    }



    public JasperPrint GenReportGov03(RequestDataModel request) throws Exception {
        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            Gov03 gov03 = GovermentRepository.GetData03(request);

            String jrxml = "/reports/Goverment/Gov03.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateTo));


            //detail
            CollectionMapGov03 collection = new CollectionMapGov03(gov03);
//            collectionInputToReport.setGov05(gov05);
//            collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));

            //---------------------------------------//
            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            JasperPrint print = JasperFillManager.fillReport(report, params,dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenReportGov04(RequestDataModel dataModel) throws Exception {

        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            List<GOV04> gov04 = GovermentRepository.GetData04(dataModel);

            String jrxml = "/reports/Goverment/Gov_04.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            //params.put("brnCode", dataModel.BrnCode);


            //detail
//            CollectionInputToReport05 collectionInputToReport = new CollectionInputToReport05();
//            collectionInputToReport.setGov05(gov05);
//            collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));


            //---------------------------------------//
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(gov04);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenReportGov05(RequestDataModel dataModel) throws Exception {
        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            List<GOV05> dataset = GovermentRepository.GetData05(dataModel);

            String jrxml = "/reports/Goverment/gov_05.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            //params.put("brnCode", dataModel.BrnCode);


            //detail
//            CollectionInputToReport05 collectionInputToReport = new CollectionInputToReport05();
//            collectionInputToReport.setGov05(gov05);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));

            //---------------------------------------//
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    public JasperPrint GenReportGov06(RequestDataModel request) throws Exception {
        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            List<GOV06> dataset = GovermentRepository.GetData06(request);


            String jrxml = "/reports/Goverment/Gov06.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            String unitType = (request.UnitType == 1)?"กิโลกรัม":"ลิตร";
            //params
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.CompCode);
            params.put("brnCode", request.BrnCode);
            params.put("unitType",unitType);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));


            //detail
//            CollectionInputToReport05 collectionInputToReport = new CollectionInputToReport05();
//            collectionInputToReport.setGov05(gov05);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));

            //---------------------------------------//
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }



    public JasperPrint GenReportGov07(RequestDataModel request) throws Exception {
        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            List<Gov07> dataset = GovermentRepository.GetData07(request);

            String jrxml = "/reports/Goverment/Gov07.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            //params
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.CompCode);
            params.put("brnCode", request.BrnCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateTo));


            //detail
//            CollectionInputToReport05 collectionInputToReport = new CollectionInputToReport05();
//            collectionInputToReport.setGov05(gov05);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));

            //---------------------------------------//
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenReportGov08(RequestDataModel request) throws Exception {

        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            List<Gov08> dataset = GovermentRepository.GetData08(request);

            String jrxml = "/reports/Goverment/Gov08.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            String unitType = (request.UnitType == 1)?"กิโลกรัม":"ลิตร";
            //params
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.CompCode);
            params.put("brnCode", request.BrnCode);
            params.put("unitType",unitType);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));


            //---------------------------------------//
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    public JasperPrint GenReportGov09(RequestDataModel request) throws Exception {
        try{
            GovermentRepository GovermentRepository = new GovermentRepository(super.env);
            List<Gov09> dataset = GovermentRepository.GetData09(request);

            String jrxml = "Gov09Ptc.jrxml";
            //String jrxml = (request.CompCode.equals("O"))?"Gov09Olp.jrxml":"Gov09Ptc.jrxml";

            final InputStream stream = this.getClass().getResourceAsStream("/reports/Goverment/"+jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            String unitType = (request.UnitType == 1)?"กิโลกรัม":"ลิตร";
            //params
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.CompCode);
            params.put("brnCode", request.BrnCode);
            params.put("unitType",unitType);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));



            //detail
//            CollectionInputToReport05 collectionInputToReport = new CollectionInputToReport05();
//            collectionInputToReport.setGov05(gov05);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
//            JRMapArrayDataSource dataSource = new JRMapArrayDataSource(new Object[]{collectionInputToReport.getMapDataSource()});

            //---------------------------------------//
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenReportGov11(RequestDataModel request) throws Exception {
        try{
            GovermentRepository repo = new GovermentRepository(super.env);
            List<Gov11> dataset = repo.GetGOV11(request);

            String jrxml = "/reports/Goverment/Gov11.jrxml";
            final InputStream stream = this.getClass().getResourceAsStream(jrxml);
            JasperReport report = JasperCompileManager.compileReport(stream);

            String unitType = (request.UnitType == 1)?"กิโลกรัม":"ลิตร";
            //params
            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.CompCode);
            params.put("brnCode", request.BrnCode);
            params.put("unitType",unitType);
            params.put("signature", ""); //url image
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("TH","th")).parse(request.DateTo));


            //detail
//            CollectionMapReportGov11 collection = new CollectionMapReportGov11();
            //collection.setGov11(dataset);
            //collectionInputToReport.setFinReceiveDtDataSource(new JRBeanCollectionDataSource(finReceiveHd.getFinReceivePayDt()));
//            JRMapArrayDataSource datasource = new JRMapArrayDataSource(new Object[]{collection.getMapDataSource()});
            //---------------------------------------//
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(report, params,datasource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
