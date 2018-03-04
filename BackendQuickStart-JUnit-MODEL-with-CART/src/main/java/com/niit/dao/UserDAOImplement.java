package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Category;
import com.niit.model.User;
import com.niit.model.User;

@Repository
public class UserDAOImplement implements UserDAO 
{

	@Autowired
	SessionFactory sessionFactory;

    @Transactional
	@Override
	public boolean addingUser(User user) 
    {
    	try 
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch (Exception e)
		{					
		return false;
		}
	}

    @Transactional
	@Override
	public boolean updatingUser(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	@Override
	public User gettingUser(int userId) 
	{
		Session session = sessionFactory.openSession();

		User user = (User)session.get(User.class, userId);  // use also load() method in place of get() method here!!
		
		return user;
	}

	@Override
	public List<User> gettingUsers() 
	{
		     Session session = sessionFactory.openSession();
			Query query = session.createQuery("from User");
			List<User> listUsers = (List<User>)query.list();
			return listUsers;
	}

	@Override
	public boolean deletingUser(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arose while Deleting" +e);		
		    return false;
		}
	}

}
