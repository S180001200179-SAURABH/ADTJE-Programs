<%@include file = "Header.jsp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form"  %>


<h3 align="center"><center> Your Cart </center></h3>

<table align = "center" class = "table">

    <tr class = "danger">
        <td colspan = "4" > Cart Products:- </td>
    </tr>
    
    <tr>
    		<td> Product ID </td>	
    		<td> Quantity </td>	
    		<td> SubTotal </td>	
    		<td> Operation </td>	
    </tr>

    
		<c:forEach items = "${cartListed}" var = "product">
		    <form action = "<c:url value = "/updateCartItem/${cartItem.cartItemId}" />" method = "get">
			<tr class = "info">
					
								<td> ${cartItem.productId} </td>
								<td> <input type = "text" name = "qty" value = "${cartItem.perProductQuantity}"/> </td>
								<td> ${cartItem.perProductQuantitySubtotal} </td>
					      <td> 
					              <input type = "submit" value = "Update" class = "btn-success"/>
					              <a href = "<c:url value = "/deletingCartItem/${cartItem.cartItemId}"/>" class = "btn btn-danger"> Delete </a>
					      </td>
			  </tr>
			  </form>
		</c:forEach>
		
		<tr>
				<td colspan = "2"> Grand Total: </td>
				<td colspan = "2"> Rs.${grandTotal} </td>
		</tr>
		
		<tr>
				<td colspan = "2"> <center> <a href = "<c:url value = "/UserHome"/>" class = "btn btn-danger btn-block"> Continue Shopping </a> </center></center></td>
				<td colspan = "2"> <center> <a href = "<c:url value = "/ConfirmOrder"/>" class = "btn btn-danger btn-block">  Check Out </a> </center> </td>
		</tr>
 







<%@include file = "Footer.jsp" %>