package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;

@Repository("categoryDAO")  // it is an annotation to signify/indicate those class object components that are are responsible for 
        //..interacting with the database i.e. they require direct ORM mapping with a given database.
public class CategoryDAOImplement implements CategoryDAO 
{

	@Autowired   // this annotation gives an indication to the compiler to search for an already existing annotation of @Bean object type
	//...here the Spring framework will already start searching for a bean that specifically has/contains SessionFactory..and if its found 
	//..it will fetch that bean object directly the moment when we call that object in this DAO implementation using SessionFactory initialization..
	//..as shown below: -
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCategory(Category category) 
	{
		sessionFactory.getCurrentSession().save(category);
		return false;
	}

}
