package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Customer 
{
	@Id
	@GeneratedValue 
	// 1
	private int customerId; // for login 
	// 2
	private String customerPassword;
	// 3
	private int orderId;
	// 4
	private int productId;
	// 5
	private int categoryId;
	// 6
	//private Cart cart = new Cart();
	// 7
	private String customerContactTitle;
	// 8
	private String customerFName;
	// 9
	private String customerLName;
	// 10
	private String customerAddress;
	// 11
	private String customerCity;
	// 12
	private String customerState;
	// 13
	private String customerCountry;
	// 14
	private String customerPostalCode;
	// 15
	private String customerPhone;
	// 16
	private String customerEmail;
	// 17
	private int cartTotalProducts;
	
	// private String userName;
	// private String userPassword;
	// private String userRole; // for admin or customer
	// private boolean enabled; // true or false
	
	// ________________________________________________________________________
	
	// 1
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	// 2
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	
	// 3
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
	// 4
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	// 5
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	// 6
/*	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	*/
	
	// 7
	public String getCustomerContactTitle() {
		return customerContactTitle;
	}
	public void setCustomerContactTitle(String customerContactTitle) {
		this.customerContactTitle = customerContactTitle;
	}
	
	
	// 8
	public String getCustomerFName() {
		return customerFName;
	}
	public void setCustomerFName(String customerFName) {
		this.customerFName = customerFName;
	}
	
	
	// 9
	public String getCustomerLName() {
		return customerLName;
	}
	public void setCustomerLName(String customerLName) {
		this.customerLName = customerLName;
	}
	
	
	// 10
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	// 11
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	
	// 12
	public String getCustomerState() {
		return customerState;
	}
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
	
	
	// 13
	public String getCustomerCountry() {
		return customerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}
	
	
	// 14
	public String getCustomerPostalCode() {
		return customerPostalCode;
	}
	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}
	
	
	// 15
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	
	// 16
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	// 17
	public int getCartTotalProducts() {
		return cartTotalProducts;
	}
	public void setCartTotalProducts(int cartTotalProducts) {
		this.cartTotalProducts = cartTotalProducts;
	}
	
}
