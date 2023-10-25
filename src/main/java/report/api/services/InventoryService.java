package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Inventory.*;
import report.api.repository.InventoryRepository;
import report.api.repository.WithdrawRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class InventoryService extends BaseService{
    public InventoryService(Environment environment) {
        super(environment);
    }


    public JasperPrint GenWithdraw(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvWithdraw> dataset = repo.GetWithdraw(request);

            //params
            String reportname = (request.ReportType ==0)?"WithdrawHd.jrxml":"WithdrawDt.jrxml";
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/"+reportname);
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
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


    public JasperPrint GenReceiveProd(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvReceiveProd> dataset = repo.GetReceiveProd(request);

            //params
            String reportname = (request.ReportType ==0)?"ReceiveProdHd.jrxml":"ReceiveProdDt.jrxml";

            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/"+reportname);
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

    public JasperPrint GenReturnSup(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvReturnSup> dataset = repo.GetReturnSup(request);

            //params
            String reportname = (request.ReportType ==0)?"ReturnSupHd.jrxml":"ReturnSupDt.jrxml";
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/" + reportname);
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

    public JasperPrint GenReturnOil(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvReturnOil> dataset = repo.GetReturnOil(request);

            //params
            String reportname = (request.ReportType ==0)?"ReturnOilHd.jrxml":"ReturnOilDt.jrxml";
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/" + reportname);
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

    public JasperPrint GenTransferOut(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvTransferOut> dataset = repo.GetTransferOut(request);

            //params
            String reportname = (request.ReportType ==0)?"TransferOutHd.jrxml":"TransferOutDt.jrxml";
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/"+reportname);
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    public JasperPrint GenTransferIn(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvTransferIn> dataset = repo.GetTransferIn(request);

            //params
            String reportname = (request.ReportType ==0)?"TransferInHd.jrxml":"TransferInDt.jrxml";
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/" + reportname);
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    public JasperPrint GenTransferCompare(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvTransferCompare> dataset = repo.GetTransferCompare(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/TransferCompare.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    public JasperPrint GenTransferNotIn(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvTransferNotIn> dataset = repo.GetTransferNotIn(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/TransferNotIn.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    public JasperPrint GenAdjust(RequestGetDataModel request) throws Exception {
        try{
            InventoryRepository repo = new InventoryRepository(super.env);
            List<InvAdjust> dataset = repo.GetAdjust(request);

            //params
            String reportname = (request.ReportType ==0)?"AdjustHd.jrxml":"AdjustDt.jrxml";
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Inventory/"+reportname);
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("brnCode", request.BrnCode);
            params.put("brnCode", request.CompCode);
            params.put("dateFrom", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateFrom));
            params.put("dateTo", new SimpleDateFormat("yyyy-MM-dd",new Locale("EN","us")).parse(request.DateTo));

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataset);
            JasperPrint print = JasperFillManager.fillReport(headReport, params, dataSource);
            return print;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

}
