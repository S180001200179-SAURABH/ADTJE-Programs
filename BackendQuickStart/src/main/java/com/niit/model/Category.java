package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category 
{
			@Id
			@GeneratedValue
			private int categoryId;
			private String categoryName;
			private String categoryDescript;
			
			public int getCategoryId() 
			{
				return categoryId;
			}
			public void setCategoryId(int categoryId) 
			{
				this.categoryId = categoryId;
			}
			public String getCategoryName() 
			{
				return categoryName;
			}
			public void setCategoryName(String categoryName) 
			{
				this.categoryName = categoryName;
			}
			public String getCategoryDescript() 
			{
				return categoryDescript;
			}
			public void setCategoryDescript(String categoryDescript) 
			{
				this.categoryDescript = categoryDescript;
			}
}
