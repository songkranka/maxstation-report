package report.api.models;

import java.util.List;

public class HeaderModel {
	public String status_code;
	public String message;
	public String company_name;
	public String company_image;
	public List<DetailModel> item;
	public int total_items;	
	
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
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_image() {
		return company_image;
	}
	public void setCompany_image(String company_image) {
		this.company_image = company_image;
	}
	public List<DetailModel> getItem() {
		return item;
	}
	public void setItem(List<DetailModel> item) {
		this.item = item;
	}
	public int getTotal_items() {
		return total_items;
	}
	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}

	
}
