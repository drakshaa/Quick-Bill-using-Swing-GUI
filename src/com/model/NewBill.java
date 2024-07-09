package com.model;

public class NewBill {
	private int billno;
	private String customername;
	private int productid;
	private String name;
	private int mrp;
	private int quantity;
	private String discount;
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "NewBill [billno=" + billno + ", customername=" + customername + ", productid=" + productid + ", name="
				+ name + ", mrp=" + mrp + ", quantity=" + quantity + ", discount=" + discount + "]";
	}
	
	

}
