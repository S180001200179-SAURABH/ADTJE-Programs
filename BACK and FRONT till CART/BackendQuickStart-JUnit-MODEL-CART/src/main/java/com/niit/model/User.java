package com.niit.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class User 
{
	@Id
	//@GeneratedValue 
	
	private String userName;
	private String userPassword;
	private String userRole; // for admin or customer
	private boolean enabled; 
	private String emailId;
	private String mobileNum;
	private String userAddress;
	private String customerName;
		
	
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
	public String getUserRole() 
	{
		return userRole;
	}
	public void setUserRole(String userRole) 
	{
		this.userRole = userRole;
	}
	public boolean isEnabled() 
	{
		return enabled;
	}
	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
	}
	public String getEmailId() 
	{
		return emailId;
	}
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	public String getMobileNum() 
	{
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) 
	{
		this.mobileNum = mobileNum;
	}
	public String getUserAddress() 
	{
		return userAddress;
	}
	public void setUserAddress(String userAddress) 
	{
		this.userAddress = userAddress;
	}
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

}
