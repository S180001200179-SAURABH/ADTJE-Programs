<%-- <%@ page language="java" contentType="text/html" import = "com.niit.model.Category"%> --%>
 
 <%@ page language="java" contentType="text/html" %> 
 
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>

<head>
<meta name = "viewport" content = "width-device-width, initial-scale - 1">
<%-- For CSS and JS -> https://www.bootstrapcdn.com/  --%>>
<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"/>
<%-- For JQuery ->  https://developers.google.com/speed/libraries/   --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style type = "text/css">
		 #topbrownstrip {background-color: brown};
</style>

</head>

			<body>
			
						<div id = "topbrownstrip" class = "container-fluid">
								 <label> Social Icon, Special Sales Announcements and General Notices </label>
						</div>
			
						<div class = "container">
								<nav class = "navbar">
										<div class = "container-fluid">
												<div class = "navbar-header">
														<a class = "navbar-brand" href = "#"> HOME </a>
												</div>
													<ul class = "nav navbar-nav">
															<li> <a href = "#"> Home </a> </li>
															<li> <a href = "GenericUserLogin"> Login </a> </li>
															<li> <a href = "CustomerRegistration"> Register </a> </li>
															<li> <a href = "AboutUs"> About Us </a> </li>
															<li> <a href = "ContactUs"> Contact Us </a> </li>
															<li> <a href = "CategoryManagement"> Manage Category </a> </li>
															<li> <a href = "ProductManagement"> Manage Product </a> </li>
															<li> <a href = "SupplierManagement"> Manage Supplier </a> </li>
															<li> <a href = "browseProductsOfACategory"> Products </a> </li>
													</ul>
										</div>
								</nav>
						</div>
				
					<%-- 			
								<center> 
									
													<a href = "/FrontendWebApp"> Home </a> &nbsp;&nbsp; | &nbsp; &nbsp;
													<a href = "GenericUserLogin"> Login </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "CustomerRegistration"> Register </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "AboutUs"> About Us </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "ContactUs"> Contact Us </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "CategoryManagement"> Manage Category </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "ProductManagement"> Manage Product </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "SupplierManagement"> Manage Supplier </a> &nbsp; &nbsp; | &nbsp; &nbsp;
													<a href = "browseProductsOfACategory"> Products </a> &nbsp; &nbsp; | &nbsp; &nbsp;
									
									</center>			
					--%>	
					
			</body>

</html>
