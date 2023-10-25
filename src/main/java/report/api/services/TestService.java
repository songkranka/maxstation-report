package report.api.services;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;

import report.api.models.CompanyModel;
import report.api.models.CompanyModel2;
import report.api.models.EmployeeModel;
import report.api.models.HeaderModel;

@Service 
public class TestService {
//LOGIC
	public List<EmployeeModel> getReport() throws JsonMappingException, JsonProcessingException {
		//call api get json
    	String json ="[{\"emp_id\":\"1111\",\"emp_name\":\"สวัสดีครับ\",\"emp_surname\":\"2222\",\"emp_position\":\"2222\"},"
    			+ "{\"emp_id\":\"22222\",\"emp_name\":\"rrrr\",\"emp_surname\":\"2222\",\"emp_position\":\"2222\"},"
    			+ "{\"emp_id\":\"33333\",\"emp_name\":\"ttt\",\"emp_surname\":\"2222\",\"emp_position\":\"2222\"}]";

    	ObjectMapper mapper = new ObjectMapper();
    	EmployeeModel[] pp1 = mapper.readValue(json, EmployeeModel[].class);    	
    
    	List<EmployeeModel> Objdata = Arrays.asList(pp1);
    	
		return Objdata;
	}
	
	//https://pt-max-station-report-uat.azurewebsites.net/api/TaxInvoice/GetTaxInvoice?docno=TXC811-21070002
	
	public List<CompanyModel2> getDataFromApiReport() throws JsonMappingException, JsonProcessingException {
		//call api get json
		String jsonString = jsonGetRequest("https://pt-max-station-report-uat.azurewebsites.net/api/TaxInvoice/Print?guid=996FB64F-9833-4D9F-A65A-61D88720B6E1");
        String jsonReplace=jsonString.replace("null","\"\"");

        System.out.println(jsonReplace);
    	ObjectMapper mapper = new ObjectMapper();

    	CompanyModel2 obj = mapper.readValue(jsonReplace, CompanyModel2.class);    	
  
        List<CompanyModel2> listObjCompany = new ArrayList<>();
        listObjCompany.add(obj);
            	
		return listObjCompany;
	}	
	
	//=========================================================================================
	//=========================================================================================
	//=========================================================================================
	// ======================== Use This Example =============================================
	public List<HeaderModel> getDataHeaderModel() throws JsonMappingException, JsonProcessingException {
		//call api get json
		String jsonString = jsonGetRequest("https://pt-max-station-report-uat.azurewebsites.net/api/TaxInvoice/GetTest?docno=test");
        String jsonReplace=jsonString.replace("null","\"\"");

        System.out.println(jsonReplace);
    	ObjectMapper mapper = new ObjectMapper();

    	HeaderModel obj = mapper.readValue(jsonReplace, HeaderModel.class);    	
  
        List<HeaderModel> listObjCompany = new ArrayList<>();
        listObjCompany.add(obj);
            	
		return listObjCompany;
	}	
	
	public List<CompanyModel> getCompany() throws JsonMappingException, JsonProcessingException {
		//call api get json
        String jsonString = jsonGetRequest("https://pt-max-station-report-dev.azurewebsites.net/api/TaxInvoice/GetReportData?guid=AA1B6E43-B6B4-44B1-834D-3605DB2A886C"); 
        
        String jsonReplace=jsonString.replace("null","\"\"");

        System.out.println(jsonReplace);
    	ObjectMapper mapper = new ObjectMapper();
    	//mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    	//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    	CompanyModel obj = mapper.readValue(jsonReplace, CompanyModel.class);    	
  
    	
        List<CompanyModel> company = new ArrayList<>();
        company.add(obj);
    	
		return company;
	}
	
	 public static String jsonGetRequest(String urlQueryString) {
		    String json = null;
		    try {
		      URL url = new URL(urlQueryString);
		      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		      connection.setDoOutput(true);
		      connection.setInstanceFollowRedirects(false);
		      connection.setRequestMethod("GET");
		      connection.setRequestProperty("Content-Type", "application/json");
		      connection.setRequestProperty("charset", "utf-8");
		      connection.connect();
		      InputStream inStream = connection.getInputStream();
		      json = streamToString(inStream); // input stream to string
		    } catch (IOException ex) {
		      ex.printStackTrace();
		    }
		    return json;
	 }
	 private static String streamToString(InputStream inputStream) {
		 String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
		 return text;
	}
}
