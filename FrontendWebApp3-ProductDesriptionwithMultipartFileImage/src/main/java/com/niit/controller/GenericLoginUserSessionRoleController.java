package com.niit.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class GenericLoginUserSessionRoleController 
		{
				@RequestMapping("/LoginSuccess")
					public String showHomePage(HttpSession session, Model M)
						   {
									String page = "";
									
									boolean loggedIn = false;						
								
									SecurityContext securityContext = SecurityContextHolder.getContext();
									Authentication authentication = securityContext.getAuthentication();
									
							// Session Login User Name Provider:	
									String username = authentication.getName();
									
									
						   // Roles Provider:
									Collection<GrantedAuthority> Roles = (Collection<GrantedAuthority>)authentication.getAuthorities();
									
									for(GrantedAuthority ROLE: Roles)
										 {
											 if(ROLE.getAuthority().equals("ADMIN_ROLE"))
											    {
												 		loggedIn = true;
												 		page = "AdminHome";
												 		session.setAttribute("loggedIn", loggedIn);
												 		session.setAttribute("username", username);
											    }
											     else if(ROLE.getAuthority().equals("CUSTOMER_ROLE"))
											           {
											    	 		loggedIn = true;
											    	 		page = "UserHome";
											    	 		session.setAttribute("loggedIn", loggedIn);
											    	 		session.setAttribute("username", username);
											           }
													     else
													     	  {
													    	 		loggedIn = false;
													    	 		page = "ProductBrowsingForPublic";
													    	 		
													     	  }										       									           
										   }
									return "page";
						   }
					
		}
