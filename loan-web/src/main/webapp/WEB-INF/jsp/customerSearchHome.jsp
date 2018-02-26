<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>MicroServiceCustomerSearch</title>
<link rel="stylesheet" href="main.css" type="text/css"></link>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
	<form:form method="POST" action="/searchCustomer" modelAttribute="search">
		<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Search Customer</h1></div>
      	<div>
		   	<h2><form:input class="input100" type="text" name="lastName" placeholder="Last Name" path="lastName"/></h2>
	  	</div>
	  	<div>
		   	<h2><form:input class="input100" type="text" name="socialSecuirtyId" placeholder="Social Secuirty Id" path="socialSecuirtyId"/></h2>
	  	</div>
		<div>
		   	<h2><form:input class="input100" type="date" name="dateofBirth" placeholder="Date Of Birth" path="dateofBirth"/></h2>
	  	</div>
		<div>
		   	<h2><form:input class="input100" type="number" name="contactNumber" placeholder="Contact Number" path="contactNumber"/></h2>
	  	</div>	
		<div><h2><input class="inputBtn" type="submit" value="Search" /><br/></h2></div><br/><br/>
		<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
	</form:form>
</div>
</body>
</html>