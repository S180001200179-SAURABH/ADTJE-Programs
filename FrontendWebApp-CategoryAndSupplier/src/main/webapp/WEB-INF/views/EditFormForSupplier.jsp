<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h3 align="center"> Supplier Editing Form </h3>

<form action="<c:url value = "/EditFormForSupplier"/>" method="post">

		<table align="center">
		                <tr bgcolor="indianred"> <td colspan="2"> Edit & Update Supplier: </td> </tr>
                                
						<tr bgcolor = "deepskyblue">
								<td> Supplier ID </td>
								<td> <input type = "text" readonly id = "supplierid" name = "supplierid" value = " ${ supplierInfo.supplierId } "/> </td>
						</tr>
						
						<tr bgcolor = "darkskyblue">
								<td>Supplier First Name</td>
								<td><input type="text" id="supplierfirstname" name="supplierfirstname" value = " ${ supplierInfo.supplierFName } "/></td>
						</tr>
						
						<tr>
								<td>Supplier Address</td>
								<td><input type="text" id="supplieraddress" name="supplieraddress" value = " ${ supplierInfo.supplierAddress } " /></td>
						</tr>
						
						<tr bgcolor = "darkskyblue">
								<td colspan="2"><input type="submit" value="UPDATE NEW SUPPLIER" /> 
								<input type="reset" value="RESET" /></td>
						</tr>
			
		</table>
	
</form>


<%-- 
==========================================================================================
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
========================================================================================
 --%>
 
 
</body>
</html>
