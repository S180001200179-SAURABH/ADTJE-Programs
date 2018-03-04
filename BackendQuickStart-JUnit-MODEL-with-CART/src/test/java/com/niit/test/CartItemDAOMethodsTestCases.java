package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CartItemDAO;
import com.niit.model.CartItem;

public class CartItemDAOMethodsTestCases 
{

		static CartItemDAO cartItemDAO;
		
//_____________________________________________________________________________________________________________

		@BeforeClass
			public static void firstInstantiateModuleForTest()
			{
					AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
					context.scan("com.niit");
					context.refresh();
					
					cartItemDAO = (CartItemDAO)context.getBean("cartItemDAO");
					
					System.out.println(" We are inside Before Class intantiated object!!"+cartItemDAO);
			}
		
//________________________________________________________________________________________________________________

			
// Test 1: ___________ADDING ' SINGLE ' CART ITEM_______________	
		@Ignore	
				@Test
					public void addingCartItemTest()
					{
							CartItem cartItem = new CartItem();
							
							cartItem.setProductId(1);
							cartItem.setUserCartId(110005);
							cartItem.setUsername("Sanjay");
							cartItem.setPerProductQuantity(17);
							cartItem.setPerProductQuantitySubtotal(23921);
							cartItem.setPaymentStatus("NP");
							
							assertTrue("Problem in Insertion", cartItemDAO.addingCartItem(cartItem));
					}
				
				
// Test 2: ____________UPDATING ' SINGLE ' CART ITEM STATUS________________	
		@Ignore
				@Test
					public void updatingCartItemTest()
					{
							CartItem cartItem = cartItemDAO.gettingCartItem(3);
							cartItem.setPerProductQuantity(5);
							cartItem.setPerProductQuantitySubtotal(6990);
							assertTrue("Problem in Update of CartItem", cartItemDAO.updatingCartItem(cartItem));
					}
				 

// Test 3: _____________DELETING ' SINGLE ' CART ITEM________________
		@Ignore
				@Test
					public void deletingCartItemTest()
					{
							CartItem cartItem = cartItemDAO.gettingCartItem(3);
							assertTrue("Problem in Deletion", cartItemDAO.deletingCartItem(cartItem));
					}
				
				
// Test 4: ____________GETTING OR RETRIEVING ' SINGLE ' CART ITEM(not required in general for frontend UI)________________
    	@Ignore
		    	@Test
				 	public void gettingCartItemTest()
		    		{
		    				assertNotNull("Problem in getting the Cart item", cartItemDAO.gettingCartItem(5));
		    		}


// Test 5: _______________RETRIEVING THE ' ENTIRE ' CART ITEM RECORD________________
		//@Ignore
				@Test
					public void listCartItemsTest()
					{
							List<CartItem> listCartItems = cartItemDAO.gettingCartItems("Ajay");
							assertNotNull("Problem in listing the Cart items in backend model's DAO", listCartItems);
							
							for(CartItem cartItem:listCartItems)
								{
									System.out.println("Cart item Id:" + cartItem.getCartItemId());
									System.out.println("Cart item Quantity:" + cartItem.getPerProductQuantity());
									System.out.println("Cart item Subtotal:" + cartItem.getPerProductQuantitySubtotal());
									System.out.println("Customer name:" + cartItem.getUsername());
									System.out.println("Cart Product's User Payment Status:" + cartItem.getPaymentStatus());
									
								}
					}
}
