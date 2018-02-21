package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.CategoryDAO;

@Controller
	public class CategoryController 
		{
					@Autowired
						CategoryDAO categoryDAO;
		
					@RequestMapping("/category")
						public String showCategory()
							{
							  		return "Category";
							}
		}
