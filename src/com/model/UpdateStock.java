package com.model;

public class UpdateStock {
	
	private int productId;
	private String productName;
	private int quantityAvail;
	private int quantityAdded;
	private int mrp;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public int getQuantityAdded() {
		return quantityAdded;
	}
	public void setQuantityAdded(int quantityAdded) {
		this.quantityAdded = quantityAdded;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	
	@Override
	public String toString() {
		return "UpdateStock [productId=" + productId + ", productName=" + productName + ", quantityAvail="
				+ quantityAvail + ", quantityAdded=" + quantityAdded + ", mrp=" + mrp + "]";
	}
}
