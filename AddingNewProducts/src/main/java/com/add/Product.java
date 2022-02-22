package com.add;

public class Product {
	private int id;
	private String productname;
	private String productdesc;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product( String productname, String productdesc) {
		super();
	
		this.productname = productname;
		this.productdesc = productdesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	
}