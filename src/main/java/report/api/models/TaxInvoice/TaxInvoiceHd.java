package report.api.models.TaxInvoice;
import java.util.List;

public class TaxInvoiceHd {
	
   public String getComp_code() {
		return comp_code;
	}

	public void setComp_code(String comp_code) {
		this.comp_code = comp_code;
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

	public String getCompany_citizenid() {
		return company_citizenid;
	}

	public void setCompany_citizenid(String company_citizenid) {
		this.company_citizenid = company_citizenid;
	}


	public String getBrn_code() {
		return brn_code;
	}

	public void setBrn_code(String brn_code) {
		this.brn_code = brn_code;
	}

	public String getBrn_name() {
		return brn_name;
	}

	public void setBrn_name(String brn_name) {
		this.brn_name = brn_name;
	}

	public String getBrn_address() {
		return brn_address;
	}

	public void setBrn_address(String brn_address) {
		this.brn_address = brn_address;
	}

	public String getBrn_no() {
		return brn_no;
	}

	public void setBrn_no(String brn_no) {
		this.brn_no = brn_no;
	}

	public String getLoc_code() {
		return loc_code;
	}

	public void setLoc_code(String loc_code) {
		this.loc_code = loc_code;
	}

	public String getDoc_no() {
		return doc_no;
	}

	public void setDoc_no(String doc_no) {
		this.doc_no = doc_no;
	}

	public String getDoc_date() {
		return doc_date;
	}

	public void setDoc_date(String doc_date) {
		this.doc_date = doc_date;
	}

	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_addr1() {
		return cust_addr1;
	}

	public void setCust_addr1(String cust_addr1) {
		this.cust_addr1 = cust_addr1;
	}

	public String getCust_addr2() {
		return cust_addr2;
	}

	public void setCust_addr2(String cust_addr2) {
		this.cust_addr2 = cust_addr2;
	}

	public String getCitizen_id() {
		return citizen_id;
	}

	public void setCitizen_id(String citizen_id) {
		this.citizen_id = citizen_id;
	}

	public double getSub_amt() {
		return sub_amt;
	}

	public void setSub_amt(double sub_amt) {
		this.sub_amt = sub_amt;
	}

	public double getDisc_amt() {
		return disc_amt;
	}

	public void setDisc_amt(double disc_amt) {
		this.disc_amt = disc_amt;
	}

	public double getVat_amt() {
		return vat_amt;
	}

	public void setVat_amt(double vat_amt) {
		this.vat_amt = vat_amt;
	}

	public double getTax_base_amt() {
		return tax_base_amt;
	}

	public void setTax_base_amt(double tax_base_amt) {
		this.tax_base_amt = tax_base_amt;
	}

	public double getNet_amt() {
		return net_amt;
	}

	public void setNet_amt(double net_amt) {
		this.net_amt = net_amt;
	}

	public String getNet_amt_text() {
		return net_amt_text;
	}

	public void setNet_amt_text(String net_amt_text) {
		this.net_amt_text = net_amt_text;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getLicense_plate() {
		return license_plate;
	}

	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	public List<TaxInvoiceDt> getItems() {
		return items;
	}

	public void setItems(List<TaxInvoiceDt> items) {
		this.items = items;
	}
    public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
    public String getCompany_phone() {
		return company_phone;
	}

	public void setCompany_phone(String company_phone) {
		this.company_phone = company_phone;
	}

	public String getCompany_fax() {
		return company_fax;
	}

	public void setCompany_fax(String company_fax) {
		this.company_fax = company_fax;
	}
	
	   public String comp_code;
       public String company_name;
       public String company_address;
       public String company_phone;
       public String company_fax;
	   public String company_image;
		public String company_citizenid;
       public String brn_code;
       public String brn_name;
       public String brn_address;
       public String brn_no;
       public String loc_code;

       public String doc_no;
       public String doc_date;
       public String cust_code;
       public String cust_name;
       public String cust_addr1;
       public String cust_addr2;
       public String citizen_id;
       public double sub_amt;
       public double disc_amt;
       public double vat_amt;
       public double net_amt;
       public double tax_base_amt;
       public String net_amt_text;
       public String emp_name;
       public String license_plate;

       public List<TaxInvoiceDt> items;
       
}
