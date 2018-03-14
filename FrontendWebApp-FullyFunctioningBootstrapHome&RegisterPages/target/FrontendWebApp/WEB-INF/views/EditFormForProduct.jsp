<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h3 align="center"> Product Editing Form </h3>

<form action="<c:url value = "/EditFormForProduct"/>" method="post">

		<table align="center">
		                <tr bgcolor="indianred"> <td colspan="2"> Edit & Update Product: </td> </tr>
                                
						<tr bgcolor = "deepskyblue">
								<td> Product ID </td>
								<td> <input type = "text" readonly id = "productid" name = "productid" value = " ${ productInfo.productId } "/> </td>
						</tr>
						
						<tr bgcolor = "darkskyblue">
								<td>Product Name</td>
								<td><input type="text" id="productname" name="productname" value = " ${ productInfo.productName } "/></td>
						</tr>
						
						<tr>
								<td>Product Description</td>
								<td><input type="text" id="productdescript" name="productdescript" value = " ${ productInfo.productDescript } " /></td>
						</tr>
						
						<tr bgcolor = "darkskyblue">
								<td colspan="2"><input type="submit" value="UPDATE NEW PRODUCT" /> 
								<input type="reset" value="RESET" /></td>
						</tr>
			
		</table>
	
</form>


<%-- 
========================================================================================== --%>
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
<%-- ========================================================================================
 --%>
 
 
</body>
</html>
