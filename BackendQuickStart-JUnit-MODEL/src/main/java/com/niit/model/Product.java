package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product 
{
	@Id
	@GeneratedValue 
	// 1
	private int productId;
	// 2
	private String productName;
	// 3
	private int categoryId;
	// 4
	private int supplierId;
	// 5
	private float productPrice;
	// 6
	private float productDiscount;
	// 7
	private int supplierNumOfStocks;
	// 8
	private String productSpecifics;
	// 9
	private String productDescript;
	// 10
	//private Multipart pImage;
	
	//_____________________________________________________________
	
	// 1
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	// 2
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	// 3
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	//4
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	
	// 5
	
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	// 6
	public float getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(float productDiscount) {
		this.productDiscount = productDiscount;
	}
	
	// 7
	public int getSupplierNumOfStocks() {
		return supplierNumOfStocks;
	}
	public void setSupplierNumOfStocks(int supplierNumOfStocks) {
		this.supplierNumOfStocks = supplierNumOfStocks;
	}
	
	// 8
	public String getProductSpecifics() {
		return productSpecifics;
	}
	public void setProdSpecifics(String prodSpecifics) {
		this.productSpecifics = prodSpecifics;
	}
	
	
	// 9
	public String getProductDescript() {
		return productDescript;
	}
	public void setProductDescript(String prodDescript) {
		this.productDescript = productDescript;
	}

	
	// 10
	/*
	 public Multipart getpImage() {
		return pImage;
	}
	public void setpImage(Multipart pImage) {
		this.pImage = pImage;
	}
	*/
	
	
}
