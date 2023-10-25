package report.api.models.TaxInvoice;

public class TaxInvoiceDt {
    public double getItem_qty() {
		return item_qty;
	}
	public void setItem_qty(double item_qty) {
		this.item_qty = item_qty;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getUnit_name() {
		return unit_name;
	}
	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public double getDisc_amt() {
		return disc_amt;
	}
	public void setDisc_amt(double disc_amt) {
		this.disc_amt = disc_amt;
	}
	public double getSub_amt() {
		return sub_amt;
	}
	public void setSub_amt(double sub_amt) {
		this.sub_amt = sub_amt;
	}
	public Integer getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(Integer seq_no) {
		this.seq_no = seq_no;
	}
	public double item_qty;
    public String product_name;
    public String unit_name;
    public double unit_price;
    public double disc_amt;
    public double sub_amt;
    public Integer seq_no;
}
