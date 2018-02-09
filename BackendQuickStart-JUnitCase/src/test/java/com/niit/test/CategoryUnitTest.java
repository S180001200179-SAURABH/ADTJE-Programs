package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryUnitTest 
{

	static CategoryDAO categoryDAO;
	//static Category category;
	
	@BeforeClass
	public static void firstInstantiateModuleForTest()
	{
		       //Create the Spring Container class object (here it is 'context') to catch a specific tagged bean from its body//
				AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
				context.scan("com.niit");
				context.refresh();
				
				// Here you use the Spring Container object to trap that bean method module with its @Bean tagged annotation name (i.e. 'categoryDAO') from DBConfig.java file//
				// Note that here the annotated code has not just instantiated the class but initialized an object by taking and assigning it a whole class as a value itself to be tested//
				CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");	
				
				System.out.println(" We are inside Before Class intantiated object!!"+categoryDAO);
			    //Category category=(Category)context.getBean("category");
	}

//@Ignore
@Test
	public void addingCategoryTest()
	{
				 Category category = new Category();
				  category.setCategoryName("Cricket Bats");
				  category.setCategoryDescript("English Willow");
		          assertTrue("Problem in Category Insertion into the H2 Database", categoryDAO.addingCategory(category));
	}
@Ignore
@Test
public void gettingCategoryTest()
{
				assertNotNull("Problem in the Category", categoryDAO.gettingCategory(2));
}
 
}
