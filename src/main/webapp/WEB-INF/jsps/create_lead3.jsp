<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Create Lead </title>
</head>
<body>
	<h2> Registration | Create </h2>
	<form action="saveLead3" method="post">
		<pre>		
		First Name <input type="text" name="firstName"/> 
		<!-- name attribute should exactly match with variable name in DTO class   -->
		Last Name <input type="text" name="lastName"/>
		Email <input type="text" name="email"/>
		Mobile <input type="text" name="phone"/>
		<input type="submit" value="Save Lead"/>
		</pre>
	</form>
	${msg}
</body>
</html>