<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>MicroServicesProductCreate</title>
	<link rel="stylesheet" href="main.css" type="text/css"></link>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
<br>
<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Product Created Successfully</h1></div><br/>
    <div><h2>productID:${name.product_ID}</h2></div><br/>
	<div><h2>productType:${name.productType}</h2></div><br/>
	<div><h2>productName:${name.productName}</h2></div><br/>
	<div><h2>interestRate:${name.interestRate}</h2></div><br/>
	<div><h2>productStatus:${name.productStatus}</h2></div><br/>
	<div><h2>minLoanTenure:${name.minLoanTenure}</h2></div><br/>	
	<div><h2>maxLoanTenure:${name.maxLoanTenure}</h2></div><br/>
	<div><h2>minLoanAmount:${name.minLoanAmount}</h2></div><br/>
	<div><h2>maxLoanAmount:${name.maxLoanAmount}</h2></div><br/><br/>
	<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</div>
</body>
</html>