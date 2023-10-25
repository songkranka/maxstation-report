package report.api.models;

public class EmployeeModel {
	public String emp_id;
	public String emp_name;
	public String emp_surname;
	public String emp_position;
	
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_surname() {
		return emp_surname;
	}
	public void setEmp_surname(String emp_surname) {
		this.emp_surname = emp_surname;
	}
	public String getEmp_position() {
		return emp_position;
	}
	public void setEmp_position(String emp_position) {
		this.emp_position = emp_position;
	}	
	
	 @Override
	    public String toString() {
	        return "User [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	    }
	
}
