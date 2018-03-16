package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.OrderDetails;

public class OrderDetailsDAOImplement implements OrderDetailsDAO {

	@Autowired
		SessionFactory sessionFactory;
	
	@Transactional
	@Override
		public boolean confirmOrder(OrderDetails orderDetails) 
				{
					try
						{
								sessionFactory.getCurrentSession().save(orderDetails);
								return true;
						}
						  catch(Exception e)
							  	{
								  		return false;
							  	}				
				}

}
