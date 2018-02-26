<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>MicroServicesAccountCreate</title>
	<link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
<br>
<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Account Created Successfully</h1></div><br/>
    <div><h2>Account Number:${name.accountNumber}</h2></div><br/>
	<div><h2>FirstName:${name.accountName}</h2></div><br/>
	<div><h2>LastName:${name.approvedLoanAmount}</h2></div><br/>
	<div><h2>interestRate:${name.interestRate}</h2></div><br/>
	<div><h2>ValidFrom:${name.loanTenure}</h2></div><br/>
	<div><h2>documentValid:${name.disbursedLoanAmount}</h2></div><br/>	
	<div><h2>status:${name.first_Next_InstallmentAmount}</h2></div><br/>
	<div><h2>firstNextInstallmentDate:${name.firstNextInstallmentDate}</h2></div><br/>
	<div><h2>arrears:${name.arrears}</h2></div><br/>
	<div><h2>charges:${name.charges}</h2></div><br/><br/><br/>
	<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</div>
</body>
</html>