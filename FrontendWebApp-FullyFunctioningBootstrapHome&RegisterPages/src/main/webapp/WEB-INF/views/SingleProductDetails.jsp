<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form"  %>



<h3 align="center">Product Details Page</h3>


	<table align = "center" class = "table">
		
			<tr bgcolor="orange">
			
					<td rowspan="6">
					<img src="<c:url value="/resources/images/${ProductInfo.productId}.jpg"/>" width="200" height="200"/>
					</td>
					
					<td> Product ID </td>			
					<td> ${ProductInfo.productId} </td>
			</tr>
					
					
			<tr bgcolor="orange">
					<td> Price </td>
					<td> ${ProductInfo.productPrice} </td>
			</tr>
			
			
			<tr bgcolor="orange">
					<td> Product Name </td>
					<td> ${ProductInfo.productName} </td>
			</tr>
			
			
			<tr bgcolor="orange">
					<td> Category Name </td>
					<td> ${CategoryName} </td>
			</tr>
			
			
			<tr bgcolor="orange">
					<td> Supplier First Name </td>
					<td> ${SupplierFName} </td>
			</tr>
			
			
			<tr bgcolor="orange">
					<td> Product Description </td>
					<td> ${ProductInfo.productDescript} </td>
			</tr>
			
			
			<tr>
					<td colspan = "2">
					<form action = "<c:url value = "/addToCart/${ProductInfo.productId}"/>" method = "get">
					<table>
								<tr>
									<td>Quantity</td>
											<td>
													<select name="quantity">
																	<option value = "1"> 1 </option>
																	<option value = "2"> 2 </option>
																	<option value = "3"> 3 </option>
																	<option value = "4"> 4 </option>
																	<option value = "5"> 5 </option>
													</select>
											</td>
											
											<td>
													 <input type = "submit" value = "AddToCart" class = "btn btn-success btn-block">	
											</td>
						         </tr>
			     </table>
			</td>
			</tr>
			
	</table>


<%@include file = "Footer.jsp" %>