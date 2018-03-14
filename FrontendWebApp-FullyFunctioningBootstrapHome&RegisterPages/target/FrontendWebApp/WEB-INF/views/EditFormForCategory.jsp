<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h3 align="center"> Category Editing Form </h3>

<form action="<c:url value = "/EditFormForCategory"/>" method="post">

		<table align="center">
		                <tr bgcolor="indianred"> <td colspan="2"> Edit & Update Category: </td> </tr>
                                
						<tr bgcolor = "deepskyblue">
								<td> Category ID </td>
								<td> <input type = "text" readonly id = "categoryid" name = "categoryid" value = " ${ categoryInfo.categoryId } "/> </td>
						</tr>
						
						<tr bgcolor = "darkskyblue">
								<td>Category Name</td>
								<td><input type="text" id="categoryname" name="categoryname" value = " ${ categoryInfo.categoryName } "/></td>
						</tr>
						
						<tr>
								<td>Category Description</td>
								<td><input type="text" id="categorydescript" name="categorydescript" value = " ${ categoryInfo.categoryDescript } " /></td>
						</tr>
						
						<tr bgcolor = "darkskyblue">
								<td colspan="2"><input type="submit" value="UPDATE NEW CATEGORY" /> 
								<input type="reset" value="RESET" /></td>
						</tr>
			
		</table>
	
</form>


<%-- 
========================================================================================== --%>
<table align="center">
			<tr>
							<td>Category ID</td>
							<td>Category Name</td>
							<td>Category Description</td>
							<td>Operation</td>
			</tr>
		
		
			<c:forEach items="${listCategories}" var="category">
			
							<tr>
										<td>${category.categoryId}</td>
										<td>${category.categoryName}</td>
										<td>${category.categoryDescript}</td>
										<td>
											<a href = "<c:url value = "/edit&updateCategory/${category.categoryId}"/>"> Edit & Update </a> /
											<a href = "<c:url value = "/deleteCategory/${category.categoryId}"/>"> Delete </a>
										</td>
							</tr>
							
			</c:forEach>


</table>
<%-- ========================================================================================
 --%>
 
 
</body>
</html>
