<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form"  %>



<h3 align="center">Product Page</h3>


	<form:form action = "InsertProduct" modelAttribute = "prod" method ="post">
		
					<table align = "center">
					
							<tr bgcolor = "yellow"> <td colspan = "2"> Product Details: </td></tr>
							
													<%--   <tr><td> Product ID  </td><td> <form:input path = "productid"/> </td></tr>    --%>
							
							
									<tr>
									
												<td> Product Name </td>
												<td> <form:input path = "productId"/> </td>
									
									</tr>
							
							
								    <tr>
											  <td> Category ID </td>
											        
												          <td> 
																	<form:select path = "categoryId"> 
																	
																						<form:option value="0" label = ">>> select <<<"></form:option>
																						<form:options items = "${listLinkedCategories}"></form:options>
																	
																	</form:select>
												
												         </td>
								     </tr>
							       
							       
							       	<tr>						
											<td bgcolor = "yellow"> Supplier ID </td>
											
														<td>
														
										 								<form:select path = "supplierId">	
										 								
													 										<form:option value = "0" label = "<<< select >>>"/>
													 										<form:options items = "${listLinkedSupplier}"/>
										 								
										 								</form:select>
										 								
										            	</td>
								    </tr>
								   
								   
								    <tr>
								
											<td> Stocks </td>
											<td> <form:input path = "supplierNumOfStocks"/> </td>
								
								    </tr>
							       
							       
							        <tr>
								
												<td bgcolor = "yellow"> Product Description </td>
												<td> <form:input path = "productDescript"/> </td>
								
								    </tr>
								   
								   
								     <tr>
								
												<td> Product Price </td>
												<td> <form:input path = "productPrice"/> </td>
								
									  </tr>
									    
									    
									   <tr bgcolor = "yellow">
									    
											    <td colspan = "2">
											    
											    		<center> <input type = "submit" value = "SUBMIT" /> </center>
											    
											    </td>
									    
									     </tr>
					       
					
					</table>
		
	</form:form>


<table align="center">
			<tr>
							<td>Product ID</td>
							<td>Product Name</td>
							<td>Product Description</td>
							<td>Operation</td>
			</tr>
		
		
			<c:forEach items="${listProducts}" var="product">
			
							<tr>
										<td>${product.productId}</td>
										<td>${product.productName}</td>
										<td>${product.productDescript}</td>
										<td>
											<a href = "<c:url value = "/edit&updateProduct/${product.productId}"/>"> Edit & Update </a> /
											<a href = "<c:url value = "/deleteProduct/${product.productId}"/>"> Delete </a>
										</td>
							</tr>
							
			</c:forEach>


</table>


</body>

</html>