package com.niit.dao;

import java.util.List;

import com.niit.model.CartItem;

public interface CartItemDAO 
{
				public boolean addingCartItem(CartItem cartItem);
				public boolean updatingCartItem(CartItem cartItem);
				public CartItem gettingCartItem(int cartItemId);
				public List<CartItem> gettingCartItems(String userName);
				public boolean deletingCartItem(CartItem cartItem);			
}