package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

@Controller
	public class SupplierController 
		{
					@Autowired
						SupplierDAO supplierDAO;
		
					@RequestMapping("/Supplier")
							public String showSupplier(Model M)
								{
										List<Supplier> listedSupplier = supplierDAO.gettingSupplier();
										M.addAttribute("listSupplier", listedSupplier);
										
										for(Supplier supplier : listedSupplier)
										{
											System.out.println(supplier.getSupplierFName() + ",");
										}
						
								  		return "Supplier";
								}
					
					@RequestMapping(value = "/InsertSupplier", method = RequestMethod.POST)
						    public String insertSupplierData(@RequestParam("suppliername") String suppliername, @RequestParam("supplierdescript") String supplierdescript, Model M)
						         {
										Supplier supplier = new Supplier();
										
										supplier.setSupplierFName(suppliername);
										supplier.setSupplierAddress(supplierdescript);
										
										supplierDAO.addingSupplier(supplier);	
										
										List<Supplier> listedSupplier = supplierDAO.gettingSupplier();
										M.addAttribute("listSupplier", listedSupplier);
										
										return "Supplier";
						         }
					
					@RequestMapping("/deleteSupplier/{supplierId}")
					        public String deleteSupplier(@PathVariable("supplierId") int supplierId, Model M)
					              {
											Supplier supplier = supplierDAO.gettingSupplier(supplierId);
											
											supplierDAO.deletingSupplier(supplier);
											
											List<Supplier> listedSupplier = supplierDAO.gettingSupplier();
											M.addAttribute("listSupplier", listedSupplier);
											
											return "Supplier";
					              }
									
					@RequestMapping("/edit&updateSupplier/{supplierId}")
							public String editSupplierFromDB(@PathVariable ("supplierId") int supplierId, Model M)
								 {
											Supplier supplier = supplierDAO.gettingSupplier(supplierId);
											
											List<Supplier> listedSupplier = supplierDAO.gettingSupplier();
											M.addAttribute("listSupplier", listedSupplier);
											M.addAttribute("supplierInfo", supplier);
											
											return "EditFormForSupplier";
								 }
					
					@RequestMapping(value = "/EditFormForSupplier", method = RequestMethod.POST)
							public String updateEditedSupplierIntoDB(@RequestParam ("supplierid") int supplierId, @RequestParam ("supplierfirstname") String supplierFName, @RequestParam("supplieraddress") String supplierAddress, Model M)
							     {
											Supplier supplier = supplierDAO.gettingSupplier(supplierId);
											supplier.setSupplierFName(supplierFName);
											supplier.setSupplierAddress(supplierAddress);
											
											supplierDAO.updatingSupplier(supplier);
											
											List<Supplier> listedSupplier = supplierDAO.gettingSupplier();
											M.addAttribute("listSupplier", listedSupplier);
											
											return "Supplier";
							     }

		}
