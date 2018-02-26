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
	<form:form method="POST" action="/addProduct" modelAttribute="product">
	<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Create Product</h1></div>
      <div>
		   <h2><form:input class="input100" type="text" name="productType" placeholder="Product Type" required="required" path="productType"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="text" name="productName" placeholder="Product Name" required="required" path="productName"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="text" name="productStatus" placeholder="Product Status" required="required" path="productStatus"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="number" name="interestRate" placeholder="Interest Rate" required="required" path="interestRate"/>%</h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="number" name="minLoanTenure" placeholder="Min Loan Tenure" required="required" path="minLoanTenure"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="number" name="maxLoanTenure" placeholder="Max Loan Tenure" required="required" path="maxLoanTenure"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="number" name="minLoanAmount" placeholder="Min Loan Amount" required="required" path="minLoanAmount"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="number" name="maxLoanAmount" placeholder="Max Loan Amount" required="required" path="maxLoanAmount"/></h2>
	  </div>
	  <div>
		   <h2><input class="inputBtn" type="submit" name="Create"/></h2>
	  </div>
	  <div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</form:form>      
</div>
</body>
</html>