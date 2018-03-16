package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CartItemDAO;
import com.niit.dao.ProductDAO;
import com.niit.model.CartItem;
import com.niit.model.Product;

@Controller
	public class CartController 
	{
	@Autowired 
		CartItemDAO cartItemDAO;
	
	@Autowired
	   ProductDAO productDAO;
	
	   	@RequestMapping("/addToCart/{productId}")
	   		public String addCartItem(@PathVariable("productId") int productId, @RequestParam("quantity") int perProductQuantity, HttpSession session, Model M)
			   		{
			   				CartItem cartItem = new CartItem();
			   				Product product = productDAO.gettingProduct(productId);
			   				
			   				String userName = (String)session.getAttribute("userName");
			   				
			   				cartItem.setProductId(productId);
							cartItem.setUserCartId(10001);
							cartItem.setUserName(userName);
							cartItem.setPerProductQuantity(perProductQuantity);
							cartItem.setPerProductQuantitySubtotal(perProductQuantity * product.getProductPrice());
							cartItem.setPaymentStatus("NP");
							
							cartItemDAO.addingCartItem(cartItem);
							
							List<CartItem> listedCartItems = cartItemDAO.gettingCartItems(userName);
			   				M.addAttribute("cartListed", listedCartItems);
			   				M.addAttribute("grandTotal", this.grandTotal(listedCartItems));
			   				
			   		        return "Cart";
			       }
	   	
	   	@RequestMapping("/updatingCartItem/{cartItemId}")
	   		public String updateCartItem(@PathVariable("cartItemId") int cartItemId, @RequestParam("qty") int perProductQuantity, HttpSession session, Model M)
	   		{
	   				CartItem cartItem = cartItemDAO.gettingCartItem(cartItemId);
	   				cartItem.setPerProductQuantity(perProductQuantity);
	   				Product product = productDAO.gettingProduct(cartItem.getProductId());
	   				cartItem.setPerProductQuantitySubtotal(perProductQuantity * product.getProductPrice());
	   				
	   				cartItemDAO.updatingCartItem(cartItem);
	   				
	   				String userName = (String)session.getAttribute("userName");
	   				
	   				List<CartItem> listedCartItems = cartItemDAO.gettingCartItems(userName);
	   				M.addAttribute("cartListed", listedCartItems);
	   				M.addAttribute("grandTotal", this.grandTotal(listedCartItems));
	   				
	   				return "Cart";
	   		}
	   	
	   	@RequestMapping("/deletingCartItem/{cartItemId}")
	   		public String deleteCartItem(@PathVariable("cartItemId") int cartItemId, HttpSession session, Model M)
	   		{
	   				CartItem cartItem = cartItemDAO.gettingCartItem(cartItemId);
	   				   				
	   				cartItemDAO.deletingCartItem(cartItem);
	   				
	   				String userName = (String)session.getAttribute("userName");
	   				
	   				List<CartItem> listedCartItems = cartItemDAO.gettingCartItems(userName);
	   				M.addAttribute("cartListed", listedCartItems);
	   				M.addAttribute("grandTotal", this.grandTotal(listedCartItems));
	   				
	   				return "Cart";
	   		}

	   	
	   	public float grandTotal(List<CartItem> listedCartItems)
	   			{
	   					float grandTotal = 0;
	   					
		   					for(CartItem cartItem: listedCartItems)
		   						 {
		   						
		   								grandTotal = grandTotal + cartItem.getPerProductQuantity() * (productDAO.gettingProduct(cartItem.getProductId()).getProductPrice());
		   								
		   						 }
	   					
	   					return grandTotal;
	   			}

}