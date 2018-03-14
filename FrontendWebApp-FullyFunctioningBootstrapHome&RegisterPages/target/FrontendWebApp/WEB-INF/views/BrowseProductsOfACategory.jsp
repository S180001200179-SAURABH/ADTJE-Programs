<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form"  %>



<h3 align="center">Category's Products Page</h3>

<table align = "center" class = "table">

    <tr class = "danger">
        <td colspan = "3" > Product Sales Listings:- </td>
    </tr>

    <tr class = "info">
		<c:forEach items = "${listProducts}" var = "product">
			
					<td>
								<img src = "<c:url value ="/resources/images/${product.productId}.jpg" />" width = 100 height = 100 />
								
								<br/>
								
								<a href = "<c:url value = "/productDescript/${product.productId}"/>"> ${product.productName} </a>
								
								<br/>
						
								INR. ${product.productPrice} /-
					</td>
			
		</c:forEach>
   </tr>

</table>

<%@include file = "Footer.jsp" %>