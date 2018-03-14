package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;


@Controller
	public class CategoryController 
		{
					@Autowired
						CategoryDAO categoryDAO;
					
					boolean FLAG = true;
		

// 1) View the Category Here:					
					
					@RequestMapping("/CategoryManagement")
							public String showCategory(Model M)
								{
										List<Category> listedCategories = categoryDAO.gettingCategories();
										M.addAttribute("listCategories", listedCategories);
										
										for(Category category : listedCategories)
										{
											System.out.println(category.getCategoryName() + ",");
										}
										System.out.println("Category Controller");
										FLAG =false;
								  		return "CategoryManagement";
								}
					
					
// 2) Insert or Add New Category Here:					
					
					@RequestMapping(value = "/InsertCategory", method = RequestMethod.POST)
						    public String insertCategoryData(@RequestParam("categoryname") String categoryname, @RequestParam("categorydescript") String categorydescript, Model M)
						         {
										Category category = new Category();
										
										category.setCategoryName(categoryname);
										category.setCategoryDescript(categorydescript);
										
										categoryDAO.addingCategory(category);	
										
										List<Category> listedCategories = categoryDAO.gettingCategories();
										M.addAttribute("listCategories", listedCategories);
										
										FLAG = false;
										return "CategoryManagement";
						         }
					
					
// 3) Delete the Category Here:
					
					@RequestMapping("/deleteCategory/{categoryId}")
					        public String deleteCategory(@PathVariable("categoryId") int categoryId, Model M)
					              {
											Category category = categoryDAO.gettingCategory(categoryId);
											
											categoryDAO.deletingCategory(category);
											
											List<Category> listedCategories = categoryDAO.gettingCategories();
											M.addAttribute("listCategories", listedCategories);
											
											FLAG = false;
											return "CategoryManagement";
					              }

					
// 4 a) Edit the Category here:		
				
					@RequestMapping("/edit&updateCategory/{categoryId}")
							public String editCategoryFromDB(@PathVariable ("categoryId") int categoryId, Model M)
								 {
											Category category = categoryDAO.gettingCategory(categoryId);
											
											List<Category> listedCategories = categoryDAO.gettingCategories();
											M.addAttribute("listCategories", listedCategories);
											M.addAttribute("categoryInfo", category);
											
											return "EditFormForCategory";
								 }
					
					
// 4 b) Update the Category here:
					
					@RequestMapping(value = "/EditFormForCategory", method = RequestMethod.POST)
							public String updateEditedCategoryIntoDB(@RequestParam ("categoryid") int categoryId, @RequestParam ("categoryname") String categoryName, @RequestParam("categorydescript") String categoryDescript, Model M)
							     {
											Category category = categoryDAO.gettingCategory(categoryId);
											category.setCategoryName(categoryName);
											category.setCategoryDescript(categoryDescript);
											
											categoryDAO.updatingCategory(category);
											
											List<Category> listedCategories = categoryDAO.gettingCategories();
											M.addAttribute("listCategories", listedCategories);
											
											return "CategoryManagement";
							     }
							
		}
