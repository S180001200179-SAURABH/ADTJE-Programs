package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Supplier 
{
	@Id
	@GeneratedValue 
	// 1
	private int supplierId;
	// 2
	private String supplierCompanyName;
	// 3
	private String supplierFName;
	// 4
	private String supplierLName;
	// 5
	private String supplierContactTitle;
	// 6
	private String supplierAddress;
	// 7
	private String supplierCity;
	// 8
	private String supplierState;
	// 9
	private String supplierCountry;
	// 10
	private String supplierPostalCode;
	// 11
	private int supplierPhone;
	// 12
	private String supplierEmail;
	// 13
	private String supplierUrl;
	// 14
	private String supplierCredentials;
	// 15
	private int categoryId;
	// 16
	private int productId;
	// 17
	private int orderId;
   // 18
	private int supplierNumOfStocks;
	
	// _____________________________________________________________________________
	
	// 1
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	
	// 2
	public String getSupplierCompanyName() {
		return supplierCompanyName;
	}
	public void setSupplierCompanyName(String supplierCompanyName) {
		this.supplierCompanyName = supplierCompanyName;
	}
	
	// 3
	public String getSupplierFName() {
		return supplierFName;
	}
	public void setSupplierFName(String supplierFName) {
		this.supplierFName = supplierFName;
	}
	
	// 4
	public String getSupplierLName() {
		return supplierLName;
	}
	public void setSupplierLName(String supplierLName) {
		this.supplierLName = supplierLName;
	}
	
	// 5
	public String getSupplierContactTitle() {
		return supplierContactTitle;
	}
	public void setSupplierContactTitle(String supplierContactTitle) {
		this.supplierContactTitle = supplierContactTitle;
	}
	
	// 6
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	// 7
	public String getSupplierCity() {
		return supplierCity;
	}
	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}
	
	// 8
	public String getSupplierState() {
		return supplierState;
	}
	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}
	
	// 9
	public String getSupplierCountry() {
		return supplierCountry;
	}
	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}
	
	// 10
	public String getSupplierPostalCode() {
		return supplierPostalCode;
	}
	public void setSupplierPostalCode(String supplierPostalCode) {
		this.supplierPostalCode = supplierPostalCode;
	}
	
	// 11
	public int getSupplierPhone() {
		return supplierPhone;
	}
	public void setSupplierPhone(int supplierPhone) {
		this.supplierPhone = supplierPhone;
	}
	
	// 12
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
	
	// 13
	public String getSupplierUrl() {
		return supplierUrl;
	}
	public void setSupplierUrl(String supplierUrl) {
		this.supplierUrl = supplierUrl;
	}
	
	// 14
	public String getSupplierCredentials() {
		return supplierCredentials;
	}
	public void setSupplierCredentials(String supplierCredentials) {
		this.supplierCredentials = supplierCredentials;
	}
	
	// 15
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	// 16
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	// 17
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	// 18
	public int getSupplierNumOfStocks() {
		return supplierNumOfStocks;
	}
	public void setSupplierNumOfStocks(int supplierNumOfStocks) {
		this.supplierNumOfStocks = supplierNumOfStocks;
	}
	
}
