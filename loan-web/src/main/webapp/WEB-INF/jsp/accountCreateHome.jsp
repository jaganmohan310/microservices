<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<link rel="stylesheet" href="main.css" type="text/css"></link>	
<title>MicroServicesAccountCreate</title>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
	<form:form method="POST" action="/accountCreate" modelAttribute="account">
		<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Account Create</h1></div>
      	<div>
		   	<h2><form:input class="input100" type="text" name="accountNumber" placeholder="Account Number" required="required" path="accountNumber"/></h2>
	  	</div>
	  	<div>
		   	<h2><form:input class="input100" type="text" name="customerId" placeholder="customerId" required="required" path="customerId"/></h2>
	  	</div>
	  	<div>
		   	<h2><form:input class="input100" type="text" name="productType" placeholder="productType" required="required" path="productType"/></h2>
	  	</div>
      	<div>
		   	<h2><form:input class="input100" type="text" name="accountName" placeholder="Account Name" required="required" path="accountName"/></h2>
	  	</div>
	  	<div>
		   	<h2><form:input class="input100" type="number" name="approvedLoanAmount" placeholder="Approved Loan Amount" required="required" path="approvedLoanAmount"/></h2>
	  	</div>
	  	<div>
		   	<h2><form:input class="input100" type="number" name="interestRate" placeholder="Interest Rate" required="required" path="interestRate"/>%</h2>
	  	</div>	
		<div>
		   	<h2><form:input class="input100" type="number" name="loanTenure" placeholder="Loan Tenure" required="required" path="loanTenure"/></h2>
	  	</div>
	  	<div>
		   	<h2><form:input class="input100" type="number" name="disbursedLoanAmount" placeholder="Disbursed Loan Amount" required="required" path="disbursedLoanAmount"/></h2>
	  	</div>
		<div>
		   	<h2><form:input class="input100" type="number" name="first_Next_InstallmentAmount" placeholder="First Next Installment Amount" required="required" path="first_Next_InstallmentAmount"/></h2>
	  	</div>
		<div>
		   	<h2><form:input class="input100" type="date" name="firstNextInstallmentDate" placeholder="First Next Installment Date" required="required" path="firstNextInstallmentDate"/></h2>
	  	</div>
		<div>
		   	<h2><form:input class="input100" type="number" name="arrears" placeholder="Arrears" required="required" path="arrears"/></h2>
	  	</div>
		<div>
		   	<h2><form:input class="input100" type="number" name="charges" placeholder="Charges" required="required" path="charges"/></h2>
	  	</div>
		<div><h2><input class="inputBtn" type="submit" value="Submit" /><br/></h2></div>
		<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
	</form:form>
</div>
</body>
</html>