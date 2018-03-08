<%@include file = "Header.jsp" %>

<%-- On adding the jstl dependency in the frontend pom file we gonna declare/add/initialize jstl library by using @taglib directive 
in our jsp page and it will have a short prefix of 'c' declared as well, so that this short signature for jstl library to call it's specific tags 
i.e. here the jstl core tags that do/handle very specific functions like looping, conditional programming, url implementing on any jsp page 
dynamically at real-time user's specific interaction with a given component of the jsp page   --%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h3 align="center">Category Page</h3>

<form action="InsertCategory" method="post">

		<table align="center">
		
						<tr>
								<td>Category Name</td>
								<td><input type="text" id="categoryname" name="categoryname" /></td>
						</tr>
						
						<tr>
								<td>Category Description</td>
								<td><input type="text" id="categorydescript" name="categorydescript" /></td>
						</tr>
						
						<tr>
								<td colspan="2"><input type="submit" value="SUBMIT" /> 
								<input type="reset" value="RESET" /></td>
						</tr>
			
		</table>
	
</form>


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


</body>

</html>