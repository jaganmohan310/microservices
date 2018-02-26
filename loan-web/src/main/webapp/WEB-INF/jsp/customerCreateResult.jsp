<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>MicroServicesCustomer</title>
	<link rel="stylesheet" href="main.css" type="text/css"></link>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
<br>
<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Customer Created Successfully</h1></div><br/>
    <div><h2>Customer Id: ${name.customerID}<br/></h2></div>
	<div><h2>FirstName:${name.firstName}<br/></h2></div>
	<div><h2>LastName:${name.lastName}<br/></h2></div>
	<div><h2>dateofBirth:${name.dateofBirth}<br/></h2></div>
	<div><h2>gender:${name.gender}<br/></h2></div>
	<div><h2>contactNumber:${name.contactNumber}<br/></h2></div><br/><br/><br/>
	<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</div>
</body>
</html>