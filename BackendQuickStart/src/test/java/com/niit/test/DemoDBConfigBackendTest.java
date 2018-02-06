package com.niit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class DemoDBConfigBackendTest 
{
     		public static void main(String arg[])
     		{
     			AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext();
     			context.scan("com.niit");
     			context.refresh();
     			
     			SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory");
     			Session session = sessionFactory.openSession();		
     			
     			System.out.println(" # # A dedicated Session has been opened for one to one direct communication between the UI and the Database! Please stay online..and continue your work.. # # ");
     			
     			CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
     			
     			Category category = new Category();
     			category.setCategoryName("Street Hawk Bike");
     			category.setCategoryDescript("Hot Wheels Toys");
     			
     			categoryDAO.addCategory(category);
     					
     			
     		} 		
}
