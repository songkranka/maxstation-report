package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Sales.*;
import report.api.repository.SalesRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SalesService  extends BaseService {
    public SalesService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenSale02(RequestDataModel request) throws Exception {
        try{
            SalesRepository repo = new SalesRepository(super.env);
            List<Sale02> dataset = repo.GetSale02PDF(request);

            String reportName = (request.ReportType == 1)?"Sale02Day.jrxml":"Sale02Sum.jrxml";
            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Sales/"+reportName);
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


    public JasperPrint GenSale03(RequestDataModel request) throws Exception {
        try{
            SalesRepository repo = new SalesRepository(super.env);
            List<Sale03> dataset = repo.GetSale03PDF(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Sales/Sale03.jrxml");
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

    public JasperPrint GenSale04(RequestDataModel request) throws Exception {
        try{
            SalesRepository repo = new SalesRepository(super.env);
            List<Sale04> dataset = repo.GetSale04PDF(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Sales/Sale04.jrxml");
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


    public JasperPrint GenSale06(RequestDataModel request) throws Exception {
        try{
            SalesRepository repo = new SalesRepository(super.env);
            List<Sale06> dataset = repo.GetSale06PDF(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Sales/Sale06.jrxml");
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
