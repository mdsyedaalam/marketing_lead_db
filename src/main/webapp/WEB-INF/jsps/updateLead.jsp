<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update Lead </title>
</head>
<body>
	<form action="updateLead" method="post">
	<table border=1>
	<tr><td style="text-align:center" colspan="2" bgcolor="lightgrey"><input type="hidden" name="id" value="${leadUpd.id}"><font size="4"> UPDATE THE LEAD DETAILS </font></td></tr>
	<tr><td>First Name</td><td><input type="text" name="firstName" value="${leadUpd.firstName}"/></td></tr>
	<tr><td>Last Name</td><td><input type="text" name="lastName" value="${leadUpd.lastName}"/></td></tr>
	<tr><td>Email</td><td><input type="text" name="email" value="${leadUpd.email}"/></td></tr>
	<tr><td>Mobile</td><td><input type="text" name="mobile" value="${leadUpd.mobile}"/></td></tr>
	<tr><td style="text-align:center" colspan="2"><input type="submit" value="Update"/></td></tr>
	</table>
	</form>
<br>	
	${msg}
</body>
</html>