<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Create Lead 2 </title>
</head>
<body>
	<h2> Registration | Create </h2>
	<form action="saveLead2" method="post">
		<pre>
		<!-- Method#2: In name attribute we're giving different names other than entity class   -->		
		First Name <input type="text" name="name"/>
		Last Name <input type="text" name="LastName"/>
		Email <input type="text" name="emailId"/>
		Mobile <input type="text" name="mobileNumber"/>
		<input type="submit" value="Save Lead"/>
		</pre>
	</form>
	${msg}
</body>
</html>