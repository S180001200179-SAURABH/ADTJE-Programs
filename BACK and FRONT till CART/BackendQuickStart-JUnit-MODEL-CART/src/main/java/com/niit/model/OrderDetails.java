package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class OrderDetails 
{
		@Id
			int cartItemId;
		
			String userName;
			Date orderDate;
			float totalPayment;
			String shippingAddress;
			String paymentMode;
			
			
			public int getCartItemId() 
			{
				return cartItemId;
			}
			public void setCartItemId(int cartItemId) 
			{
				this.cartItemId = cartItemId;
			}
			public String getUserName() 
			{
				return userName;
			}
			public void setUserName(String userName) 
			{
				this.userName = userName;
			}
			public Date getOrderDate() 
			{
				return orderDate;
			}
			public void setOrderDate(Date orderDate) 
			{
				this.orderDate = orderDate;
			}
			public float getTotalPayment() 
			{
				return totalPayment;
			}
			public void setTotalPayment(float totalPayment) 
			{
				this.totalPayment = totalPayment;
			}
			public String getShippingAddress() 
			{
				return shippingAddress;
			}
			public void setShippingAddress(String shippingAddress) 
			{
				this.shippingAddress = shippingAddress;
			}
			public String getPaymentMode() 
			{
				return paymentMode;
			}
			public void setPaymentMode(String paymentMode) 
			{
				this.paymentMode = paymentMode;
			}
			
}
