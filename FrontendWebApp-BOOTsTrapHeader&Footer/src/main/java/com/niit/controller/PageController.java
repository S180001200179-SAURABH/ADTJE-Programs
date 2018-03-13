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
					
						@RequestMapping("/GenericUserLogin")
							public String showLogin()
							{
											return "GenericUserLogin";
							}
						
						@RequestMapping("/CustomerRegistration")
							public String showRegister()
							{
											return "CustomerRegisteration";
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
