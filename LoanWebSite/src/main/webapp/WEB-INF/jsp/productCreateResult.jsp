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
    product_ID:${name.product_ID}<br/>
	productType:${name.productType}<br/>
	productName:${name.productName}<br/>
	interestRate:${name.interestRate}<br/>
	productStatus:${name.productStatus}<br/>
	minLoanTenure:${name.minLoanTenure}<br/>	
	maxLoanTenure:${name.maxLoanTenure}<br/>
	minLoanAmount:${name.minLoanAmount}<br/>
	maxLoanAmount:${name.maxLoanAmount}<br/>
	</body>
</html>