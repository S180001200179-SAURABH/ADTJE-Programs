<%@include file = "Header.jsp" %>

<h3 align="center"> Login Page </h3>

<form action = "PerformLogin" method = "post">
	<table align = "center" border = "1">
		  <tr bgcolor="yellow">
		    	<td colspan = "2"> <center> Enter User Login Details: </center></td>
		  </tr>
		  <tr>
		   		<td> User Login Name: </td>
		   		<td><input type = "text" name = "username">  </input></td>
		  </tr>
		  <tr>
		   		<td> Password: </td>
		  	 	<td> <input type = "password" name = "password"></td> 
		  </tr>
		  <tr bgcolor = "yellow">
		    	<td colspan = "2"></td>
		   		 <center><input type = "submit" value = "Login"/></center>
		  </tr>
	</table>
</form>

<%@include file = "Footer.jsp" %>