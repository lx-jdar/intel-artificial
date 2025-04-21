package com.sample.model;

public class Product {
	
	String productName;
	int stock;
	public StockLevel level;
	
	public Product(String productName, int stock) {
		super();
		this.productName = productName;
		this.stock = stock;
		this.level = StockLevel.no_defined;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public StockLevel getLevel() {
		return level;
	}
	
	public void setLevel(StockLevel level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", stock=" + stock + "]";
	}
	
}
