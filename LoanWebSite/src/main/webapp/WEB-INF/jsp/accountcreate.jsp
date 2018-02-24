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
	<form:form method="POST" action="/accountCreate"
		modelAttribute="account">
		<form:label path="accountName">accountName</form:label>
		<form:input path="accountName" /><br/>

		<form:label path="approvedLoanAmount">approvedLoanAmount</form:label>
		<form:input path="approvedLoanAmount" /><br/>
		
		<form:label path="interestRate">interestRate</form:label>
		<form:input path="interestRate" /><br/>		
		
		<form:label path="loanTenure">loanTenure</form:label>
		<form:input path="loanTenure" /><br/>
		
		<form:label path="disbursedLoanAmount">disbursedLoanAmount</form:label>
		<form:input path="disbursedLoanAmount" /><br/>
		
		<form:label path="first_Next_InstallmentAmount">first_Next_InstallmentAmount</form:label>
		<form:input path="first_Next_InstallmentAmount" /><br/>
		
		<form:label path="firstNextInstallmentDate">firstNextInstallmentDate</form:label>
		<form:input path="firstNextInstallmentDate" /><br/>
		
		<form:label path="arrears">arrears</form:label>
		<form:input path="arrears" /><br/>
		
		<form:label path="charges">charges</form:label>
		<form:input path="charges" /><br/>
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>