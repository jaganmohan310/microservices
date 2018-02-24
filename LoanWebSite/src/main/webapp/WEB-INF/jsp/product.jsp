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
	<form:form method="POST" action="/addProduct"
		modelAttribute="product">
		<form:label path="productType">productType</form:label>
		<form:input path="productType" /><br/>

		<form:label path="productName">productName</form:label>
		<form:input path="productName" /><br/>
		
		<form:label path="interestRate">interestRate</form:label>
		<form:input path="interestRate" /><br/>
		
		<form:label path="productStatus">productStatus</form:label>
		<form:input path="productStatus" /><br/>
		
		<form:label path="minLoanTenure">minLoanTenure</form:label>
		<form:input path="minLoanTenure" /><br/>
		
		<form:label path="maxLoanTenure">maxLoanTenure</form:label>
		<form:input path="maxLoanTenure" /><br/>
		
		<form:label path="minLoanAmount">minLoanAmount</form:label>
		<form:input path="minLoanAmount" /><br/>
		
		<form:label path="maxLoanAmount">maxLoanAmount</form:label>
		<form:input path="maxLoanAmount" /><br/>
		
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>