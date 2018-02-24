<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreateCustomer Information</title>
</head>
<body>
    Account Number:${name.accountNumber}<br/>
	FirstName:${name.accountName}<br/>
	LastName:${name.approvedLoanAmount}<br/>
	interestRate:${name.interestRate}<br/>
	ValidFrom:${name.loanTenure}<br/>
	documentValid:${name.disbursedLoanAmount}<br/>	
	status:${name.first_Next_InstallmentAmount}<br/>
	firstNextInstallmentDate:${name.firstNextInstallmentDate}<br/>
	arrears:${name.arrears}<br/>
	charges:${name.charges}<br/>
</body>
</html>