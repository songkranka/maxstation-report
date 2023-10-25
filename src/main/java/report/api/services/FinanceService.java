package report.api.services;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.core.env.Environment;
import report.api.models.Finance.Fin03;
import report.api.models.Finance.Fin08;
import report.api.models.Finance.RequestDataModel;
import report.api.repository.FinanceRepository;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class FinanceService extends BaseService  {
    public FinanceService(Environment environment) {
        super(environment);
    }



    public JasperPrint GenFin03(RequestDataModel request) throws Exception {
        try{
            FinanceRepository repo = new FinanceRepository(super.env);
            List<Fin03> dataset = repo.GetFin03PDF(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Finance/Fin03.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.BrnCode);
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

    public JasperPrint GenFin08(RequestDataModel request) throws Exception {
        try{
            FinanceRepository repo = new FinanceRepository(super.env);
            List<Fin08> dataset = repo.GetFin08PDF(request);

            //params
            final InputStream headStream = this.getClass().getResourceAsStream("/reports/Finance/Fin08.jrxml");
            JasperReport headReport = JasperCompileManager.compileReport(headStream);

            Map<String, Object> params = new HashMap<>();
            params.put("compCode", request.BrnCode);
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
