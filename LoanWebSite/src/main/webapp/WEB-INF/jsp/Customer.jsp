<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Information</title>
</head>
<body>
    Customer Id: ${name.customerID}<br/>
	FirstName:${name.firstName}<br/>
	LastName:${name.lastName}<br/>
	dateofBirth:${name.dateofBirth}<br/>
	gender:${name.gender}<br/>
	contactNumber:${name.contactNumber}<br/>
	
</body>
</html>