package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.CartItem;

@Repository("cartItemDAO")
	public class CartItemDAOImplement implements CartItemDAO
	{
		@Autowired
			SessionFactory sessionFactory;
		
		@Transactional
		@Override
			public boolean addingCartItem(CartItem cartItem) 
			{
				try 
				{
					sessionFactory.getCurrentSession().save(cartItem);
					return true;
				}
				catch (Exception e)
				{					
				return false;
				}
			}
		
		@Transactional
		@Override
			public boolean updatingCartItem(CartItem cartItem) 
			{
				try
				{
					sessionFactory.getCurrentSession().update(cartItem);
					return true;
				}
				catch(Exception e)
				{
				return false;
				}
			}
	
		
		@Override
			public CartItem gettingCartItem(int cartItemId) 
			{
				try
				{
					Session session = sessionFactory.openSession();
					CartItem cartItem = (CartItem)session.get(CartItem.class, cartItemId);
					return cartItem;
				}
				catch(Exception e)
				{
				    return null; 
				}
			}
	
		
		@Override
			public List<CartItem> gettingCartItems(String userName) 
			{
				try
				{
					Session session = sessionFactory.openSession();
					String status = "NP";
					Query query = session.createQuery("From CartItem where username =:username and paymentstatus =:status ");
					query.setParameter("userName", userName);
					query.setParameter("status", status);
					List<CartItem> listCartItems = (List<CartItem>)query.list();
					return listCartItems;
				}
				catch(Exception e)
				{
					System.out.println("gettingCartItems(String userName) " + e);
				    return null;
				}
			}
		
		@Transactional
		@Override
			public boolean deletingCartItem(CartItem cartItem) 
			{
				try
				{
					sessionFactory.getCurrentSession().delete(cartItem);
					return true;
				}
				catch(Exception e)
				{
				return false;
				}
			}
	
	}
