package report.api.models;

import java.util.ArrayList;
import java.util.List;

public class CompanyModel2 {
	public String status_code;
	public String message;
	public int total_items;	
	public List<CompanyDetailModel> data;
	
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getTotal_items() {
		return total_items;
	}
	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}
	public List<CompanyDetailModel> getData() {
		return data;
	}
	public void setData(List<CompanyDetailModel> data) {
		this.data = data;
	}
	
	
}
