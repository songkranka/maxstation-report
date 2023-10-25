package report.api.controller;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("/api/report/")
public class ReportController {
	
	
	@GetMapping("invoicepdf")
	public void generatePDF(Map<String, Object> model, HttpServletRequest request, HttpServletResponse  response, @PathVariable("doc_no") String doc_no) throws JRException, IOException {
		/*
		TaxInvoiceService taxInvoiceService = new TaxInvoiceService();
		JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(taxInvoiceService.generateTaxInvoice());
		
		//InputStream stream = this.getClass().getResourceAsStream("/invoice.jrxml");
		//JasperReport compileReport = JasperCompileManager.compileReport(stream);
		JasperReport compileReport = JasperCompileManager
				.compileReport(new FileInputStream("src/main/resources/reports/taxinvoice.jrxml"));
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);	
		JasperExportManager.exportReportToPdfFile(report, "invoice.pdf");
		return "generate";
		*/
		//InputStream stream = this.getClass().getResourceAsStream("src/main/resources/reports/taxinvoice.jrxml");

		// Compile the Jasper report from .jrxml to .japser
		//JasperReport report = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/reports/taxinvoice.jrxml"));
		
    	//Map<String,Object> params = new HashMap<String,Object>();
    	//params.put("company_name_title","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"); 
    	
    	//TaxInvoiceService taxInvoiceService = new TaxInvoiceService();
    	//JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(taxInvoiceService.generateTaxInvoice());
		//JasperPrint print = JasperFillManager.fillReport(report, params, source);
		
		//String fileName = getCurrentLocalDateTimeStamp().concat(".pdf");
		//JasperExportManager.exportReportToPdfFile(print, pathPdf.concat(fileName));
		//return fileName;
		//TaxInvoiceService taxInvoiceService = new TaxInvoiceService();
		String xxxx = "1";
	}
	
	private static String getCurrentLocalDateTimeStamp() {
	    return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss"));
	}
	
//	@SuppressWarnings("deprecation")
//	@GetMapping(value = "/displayPdf")
//	public void displayPdf(Map<String, Object> model, HttpServletRequest request, HttpServletResponse  response) throws JRException, IOException {
//		ByteArrayOutputStream byteArr =new ByteArrayOutputStream();
//		response.setContentType("application/pdf; charset=UTF-8");
//		
//		net.sf.jasperreports.engine.JasperExportManager.exportReportToPdfStream(GenReport(),byteArr);
//				
//		response.setContentLength(byteArr.size());
//		ServletOutputStream outPut = response.getOutputStream();
//		byteArr.writeTo(outPut);
//		outPut.flush();
//	}
	
//	public JasperPrint GenReport() throws JRException, IOException {
//		// Fetching the .jrxml file from the resources folder.
//		final InputStream stream = this.getClass().getResourceAsStream("/test-report.jrxml");
//
//		// Compile the Jasper report from .jrxml to .japser
//		final JasperReport report = JasperCompileManager.compileReport(stream);
//		
//    	Map<String,Object> params = new HashMap<String,Object>();
//    	params.put("company_name","PTG.co,ltd"); 
//    	
//    	TestService testService = new TestService();
//    	final JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(testService.getReport());
//		final JasperPrint print = JasperFillManager.fillReport(report, params,source);
//		
//		return print;
//	}	
}
