<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h3 align="center">Supplier Page</h3>

<form action="InsertSupplier" method="post">

		<table align="center">
		
						<tr>
								<td>Supplier First Name</td>
								<td><input type="text" id="supplierfirstname" name="supplierfirstname" /></td>
						</tr>
						
						<tr>
								<td>Supplier Address</td>
								<td><input type="text" id="supplieraddress" name="supplieraddress" /></td>
						</tr>
						
						<tr>
								<td colspan="2"><input type="submit" value="SUBMIT" /> 
								<input type="reset" value="RESET" /></td>
						</tr>
			
		</table>
	
</form>


<table align="center">
			<tr>
							<td>Supplier ID</td>
							<td>Supplier First Name</td>
							<td>Supplier Address</td>
							<td>Operation</td>
			</tr>
		
		
			<c:forEach items="${listSupplier}" var="supplier">
			
							<tr>
										<td>${supplier.supplierId}</td>
										<td>${supplier.supplierFName}</td>
										<td>${supplier.supplierAddress}</td>
										<td>
											<a href = "<c:url value = "/edit&updateSupplier/${supplier.supplierId}"/>"> Edit & Update </a> /
											<a href = "<c:url value = "/deleteSupplier/${supplier.supplierId}"/>"> Delete </a>
										</td>
							</tr>
							
			</c:forEach>


</table>

</body>
</html>
