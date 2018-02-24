package com.niit.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.CategoryDAO;
import com.niit.dao.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Controller
public class ProductController 
{
		@Autowired
			CategoryDAO categoryDAO;
		
		@Autowired
			SupplierDAO supplierDAO;
		
		@RequestMapping("/product")
			public String showProductPage(Model M)
					{
							Product product = new Product();
							M.addAttribute(product);
							
							// List<Category> listedCategories = categoryDAO.gettingCategories();
							//M.addAttribute("listLinkedCategories", this.listingAllLinkedCategories());
							M.addAttribute("listLinkedSupplier", this.listingAllLinkedSupplier());
							
							return "Product";
					}
		
				public LinkedHashMap<Integer,String> listingAllLinkedCategories()
							{
									List<Category> listedCategories = categoryDAO.gettingCategories();
									
										LinkedHashMap <Integer,String> linkTheListedCategories = new LinkedHashMap <Integer,String>();
										
												for(Category category : listedCategories)
														{
																linkTheListedCategories.put(category.getCategoryId(),category.getCategoryName());
														}
												
									return linkTheListedCategories;
							}
				
				
				public LinkedHashMap<Integer,String> listingAllLinkedSupplier()
				{
						List<Supplier> listedSupplier = supplierDAO.gettingSupplier();
						
							LinkedHashMap <Integer,String> linkTheListedSupplier = new LinkedHashMap <Integer,String>();
							
									for(Supplier supplier : listedSupplier)
											{
													linkTheListedSupplier.put(supplier.getSupplierId(),supplier.getSupplierFName());
											}
									
						return linkTheListedSupplier;
				}

		
}
