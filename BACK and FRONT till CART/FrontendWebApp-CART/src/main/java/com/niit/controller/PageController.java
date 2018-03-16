package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

		@Controller
			public class PageController 
			{
			
						@RequestMapping("/")
							public String showHomePage()
							{
											return "index";
						    }
					
						@RequestMapping("/Login")
							public String showLogin()
							{
											return "Login";
							}
						
						@RequestMapping("/CustomerRegistration")
							public String showRegister()
							{
											return "CustomerRegistration";
							}
						
						@RequestMapping("/AboutUs")
							public String showAboutUs()
							{
											return "AboutUs";
							}
				
						@RequestMapping("/ContactUs")
							public String showContactUs()
							{
											return "ContactUs";
							}
				
		}
