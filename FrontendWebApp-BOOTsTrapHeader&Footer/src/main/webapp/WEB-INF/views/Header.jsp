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
														<a class = "navbar-brand" href = "#"> E-Commerce Sales Home Page </a>
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
				
						<div id = "MyCAROUSEL" class = "carousel" data-ride = "carousel" data-interval = "2000" width = "700" height = "250">
								
								<ol class = "carousel-indicators">
									  <li data-target = "#MyCOROUSEL" data-slide-to ="0" class = "active"></li>
									  <li data-target = "#MyCOROUSEL" data-slide-to = "1"></li>
									  <li data-target = "#MyCOROUSEL" data-slide-to = "2"></li>
									  <li data-target = "#MyCOROUSEL" data-slide-to = "3"></li>
									  <li data-target = "#MyCOROUSEL" data-slide-to = "4"></li>
								</ol>
								
								<div class = "carousel-inner" role = "listbox">
										
										<div class = "item active">
												<img src = "<c:url value = "/resources/images/corousel-pics/C1.jpg" />" width="1366px" height="700px"/>
										</div>
										
										<div class = "item">
												<img src = "<c:url value ="/resources/images/corousel-pics/C2.jpg"/>"  width="1366px" height="700px"/>
										</div>
										
										<div class = "item">
												<img src = "<c:url value = "/resources/images/corousel-pics/C3.jpg" />"  width="1366px" height="700px"/>
										</div>
										
										<div class = "item">
												<img src = "<c:url value = "/resources/images/corousel-pics/C4.jpg" />" width="1366px" height="700px"/>
										</div>
										
										<div class = "item">
												<img src = "<c:url value = "/resources/images/corousel-pics/C5.jpg" />" width="1366px" height="700px"/>
										</div>
								
								</div>
								
								<a class = "left corousel-control" href = "#MyCOROUSEL" role = "button" data-slide = "prev">
											<span class = "glyphicon glyphicon-chevron-left" aria-hidden = "true"></span>
											<span class = "sr-only"> Previous </span>
								</a>
								
								<a class = "right corousel-control" href = "#MyCOROUSEL" role = "button" data-slide = "next">
											<span class = "glyphicon glyphicon-chevron-right" aria-hidden = "true"></span>
											<span class = "sr-only"> Next </span>
								</a>
								
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
