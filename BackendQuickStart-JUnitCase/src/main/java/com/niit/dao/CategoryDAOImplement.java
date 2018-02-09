package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;

@Repository("categoryDAO")  // it is an annotation to signify/indicate those class object components that are responsible for 
        //..interacting with the database i.e. they require direct ORM mapping with a given database.
public class CategoryDAOImplement implements CategoryDAO 
{

	   // this annotation gives an indication to the compiler to search for an already existing annotation of @Bean object type
	//...here the Spring framework will already start searching for a bean that specifically has/contains SessionFactory..and if its found 
	//..it will fetch that bean object directly the moment when we call that object in this DAO implementation using SessionFactory initialization..
	//..as shown below: -
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addingCategory(Category category) 
	{
		try
		{
		    sessionFactory.getCurrentSession().save(category);   // <~~ The SECOND LAST STEP - Very Very Important:- This is where the categoryDAO opens up the entire tunnel for a UI (via. the Spring Container Bean OR SessionFactory object, both are same) to interact and change the database!!
		    return true;
		}
		catch(Exception e)
		{
		    System.out.println("Exception arose while processing addCategory" +e);
			return false;
		}
	}
	
	//getCategory()
	
	@Override
public Category gettingCategory(int categoryId)
{
		//Session session = sessionFactory.openSession();

		Category category = (Category)sessionFactory.openSession().get(Category.class, categoryId);  // use also load() method in place of get() method here!!
		return category;
}
}
