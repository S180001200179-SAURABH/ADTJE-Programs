package com.niit.dao;

import com.niit.model.Category;

public interface CategoryDAO 
{
				public boolean addingCategory(Category category);
				public Category gettingCategory(int categoryId);
}
