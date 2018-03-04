package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
	public class CartItem 
	{
			@Id
			@GeneratedValue
				int cartItemId; // for this table CartItem model this will become the primary key
			
				int userCartId; // specific to a user
				int productId;  // form the product.java Model
				int perProductQuantity;
				int perProductQuantitySubtotal;
				
				String username;  //Will be a primary key in the database
				String paymentStatus;
			
			
			public int getCartItemId() 
			{
				return cartItemId;
			}
			public void setCartItemId(int cartItemId) 
			{
				this.cartItemId = cartItemId;
			}
			public int getUserCartId() 
			{
				return userCartId;
			}
			public void setUserCartId(int userCartId) 
			{
				this.userCartId = userCartId;
			}
			public int getProductId() 
			{
				return productId;
			}
			public void setProductId(int productId) 
			{
				this.productId = productId;
			}
			public int getPerProductQuantity() 
			{
				return perProductQuantity;
			}
			public void setPerProductQuantity(int perProductQuantity) 
			{
				this.perProductQuantity = perProductQuantity;
			}
			public int getPerProductQuantitySubtotal() 
			{
				return perProductQuantitySubtotal;
			}
			public void setPerProductQuantitySubtotal(int perProductQuantitySubtotal) 
			{
				this.perProductQuantitySubtotal = perProductQuantitySubtotal;
			}
			public String getUsername() 
			{
				return username;
			}
			public void setUsername(String username) 
			{
				this.username = username;
			}
			public String getPaymentStatus() 
			{
				return paymentStatus;
			}
			public void setPaymentStatus(String paymentStatus) 
			{
				this.paymentStatus = paymentStatus;
			} 
	}
