package report.api.controller;

import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import report.api.models.TaxInvoice.RequestGetDataModel;
import report.api.services.TaxInvoiceService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.Map;

@RestController()
@RequestMapping("/TaxInvoice/")
public class TaxInvoiceController extends BaseController {
	
	public TaxInvoiceController(Environment environment) {		
		super(environment);
		// TODO Auto-generated constructor stub
	}
	


	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(value = "PrintPdf")
	public void PrintPdf(HttpServletResponse response, @RequestBody RequestGetDataModel dataModel) throws Exception {

		ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
		response.setContentType("application/pdf; charset=UTF-8");

		TaxInvoiceService service = new TaxInvoiceService(super.env);
		JasperExportManager.exportReportToPdfStream(service.GenReportTaxInvoice(dataModel), byteArr);

		response.setContentLength(byteArr.size());
		ServletOutputStream outPut = response.getOutputStream();
		byteArr.writeTo(outPut);
		outPut.flush();
	}



}
