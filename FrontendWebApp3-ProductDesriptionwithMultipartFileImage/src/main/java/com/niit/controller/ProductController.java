package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
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
		
		@Autowired
			ProductDAO productDAO;
		
		boolean FLAG = true;
		
		
// 1) View the Product Here:	               >>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		@RequestMapping("/Product")
			public String showProduct(Model M)
					{
		                    // Here we are initializing a blank product object because of the Model M characteristics for Spring Form implementation ..
			               //...in the Product.jsp page which, the moment this Product.jsp page gets loaded in a web browser then, the Model attribute..
		               	   //...can automatically get attached to the product object itself to deliver data of type Product to the Spring Form for it to..
			               //...translate in HTML Form output types.
							Product product = new Product();  
							M.addAttribute(product);
							
							// List<Category> listedCategories = categoryDAO.gettingCategories();
							M.addAttribute("listLinkedCategories", this.listingAllLinkedCategories());
							M.addAttribute("listLinkedSupplier", this.listingAllLinkedSupplier());
							
							FLAG = false;
							return "Product";
					}
		
		
// 2) Insert or Add New Product Here:		       >>>>>>>>>>>>>>>>>>>>>>>>
		
		@RequestMapping(value = "/InsertProduct", method = RequestMethod.POST)
			public String insertProductData(@ModelAttribute("prod") Product product, Model M, @RequestParam("productImage")MultipartFile inputImg, BindingResult result) // Here, product values will go to DB from UI &, M values will go from DB to UI
					{
							Product prodt = new Product();
							M.addAttribute(prodt);
							
							productDAO.addingProduct(product);
														
							// Image Upload Code Section Start: -      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
							
							String imagePath ="J:\\NIIT - JAVA\\Java Digi-Next\\SaurabhKr Patna ADTJE Programs ID-S180001200179\\MAVEN\\MAVEN-1\\FrontendWebApp\\src\\main\\webapp\\resources\\images\\"; 
							imagePath = imagePath + String.valueOf(product.getProductId()) + ".jpg";
							
							File IMAGE = new File(imagePath);
							
							if(!inputImg.isEmpty())
								{
										try
											{
													byte[] byteOfinputImg = inputImg.getBytes();
													
													FileOutputStream FOSofIMAGE = new FileOutputStream(IMAGE);
													BufferedOutputStream byteofIMAGE = new BufferedOutputStream(FOSofIMAGE);
													
													byteofIMAGE.write(byteOfinputImg);
													
													byteofIMAGE.close();
											}
										
											catch(Exception e)
													{
														System.out.println("Exception arose in any of the image byte/Stream conversion! Please check:" +e );
														e.printStackTrace();
													}
								}
								else
								{
										System.out.println("Problem in uploading..Please check the image dimentional restrictions and try again!!");
								}
													
							// Image Upload Code Section Ends!!            <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
							
							M.addAttribute("listLinkedCategories", this.listingAllLinkedCategories());
							M.addAttribute("listLinkedSupplier", this.listingAllLinkedSupplier());
							
							FLAG = false;
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
									
									
									
// 3) Delete the Product Here:                 >>>>>>>>>>>>>>>>>>>>>>>>>>>

									@RequestMapping("/deleteProduct/{productId}")
							        public String deleteProduct(@PathVariable("productId") int productId, Model M)
							              {
													Product product = productDAO.gettingProduct(productId);
													
													productDAO.deletingProduct(product);
													
													List<Product> listedProducts = productDAO.gettingProducts();
													M.addAttribute("listProducts", listedProducts);
													
													FLAG = false;
													return "Product";
							              }
							
									
// 4 a) Edit the Product here:				 >>>>>>>>>>>>>>>>>>>>>>>>>>>>
									
							@RequestMapping("/edit&updateProduct/{productId}")
									public String editProductFromDB(@PathVariable ("productId") int productId, Model M)
										 {
													Product product = productDAO.gettingProduct(productId);
													
													List<Product> listedProducts = productDAO.gettingProducts();
													M.addAttribute("listProducts", listedProducts);
													M.addAttribute("productInfo", product);
													
													return "EditFormForProduct";
										 }
							
							
// 4 b) Update the Product here:	                >>>>>>>>>>>>>>>>>>>>>>>>>>>>
																
							@RequestMapping(value = "/EditFormForProduct", method = RequestMethod.POST)
									public String updateEditedProductIntoDB(@RequestParam ("productid") int productId, @RequestParam ("productname") String productName, @RequestParam("productdescript") String productDescript, Model M)
									     {
													Product product = productDAO.gettingProduct(productId);
													product.setProductName(productName);
													product.setProductDescript(productDescript);
													
													productDAO.updatingProduct(product);
													
													List<Product> listedProducts = productDAO.gettingProducts();
													M.addAttribute("listProducts", listedProducts);
													
													return "Product";
									     }

							
							
							@RequestMapping(value = "/browseProductsOfACategory", method = RequestMethod.GET)
							public String showCategoryProductPage(Model M)
									{
											List<Product> listedProducts = productDAO.gettingProducts();
											M.addAttribute("listProducts", listedProducts);
											
											return "BrowseProductsOfACategory";
									}
							
							
							@RequestMapping(value = "/productDescript/{productId}", method = RequestMethod.GET)
								public String switchToSingleProductDetailsPage(@PathVariable("productID")int productId, Model M)
								       {

												Product product = productDAO.gettingProduct(productId);
												M.addAttribute("ProductInfo", product);
												
												String categoryName = categoryDAO.gettingCategory(product.getCategoryId()).getCategoryName();
												M.addAttribute("CategoryName", categoryName);
				
												String supplierName = supplierDAO.gettingSupplier(product.getSupplierId()).getSupplierFName();
												M.addAttribute("SupplierFName", supplierName);
												
												return "SingleProductDetails";
							
								       }

}
