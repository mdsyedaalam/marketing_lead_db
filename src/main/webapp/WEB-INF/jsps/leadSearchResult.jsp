<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%> <!-- JSTL Directive Tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	<table border=1>
			<tr><th colspan="7" bgcolor="lightgrey"><font size="6"> LIST OF LEADS </font></th></tr>
			<tr  bgcolor="lightgrey">
			<th>Id No.</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Mobile</th><th colspan="2">Action</th></tr>
		<c:forEach var="leads" items="${lds}">
			<tr><td style="text-align:center"> ${leads.id} </td>
			<td> ${leads.firstName} </td>
			<td>${leads.lastName}</td>
			<td>${leads.email}</td>
			<td>${leads.mobile}</td> 
			<td><a href="delete?id=${leads.id}"><input style="background-color:mistyrose; color:darkred" type="submit" value="Delete"></a></td>
			<td><a href="update?id=${leads.id}"><input style="background-color:lightcyan; color:darblue" type="submit" value="Update"></a></td>
			</tr>	
        </c:forEach>
	</table>
</body>
</html>