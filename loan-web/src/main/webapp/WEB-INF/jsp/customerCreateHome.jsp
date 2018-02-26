<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>MicroServicesCustomerCreate</title>
	<link rel="stylesheet" href="main.css" type="text/css"></link>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
<br>
<form:form method="POST" action="/createCustomer" modelAttribute="customer">
      <div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Create Customer</h1></div>
      <div>
		   <h2><form:input class="input100" type="text" name="firstName" placeholder="FirstName" required="required" path="firstName"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="text" name="lastName" placeholder="LastName" required="required" path="lastName"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="date" name="dateofBirth" placeholder="Date Of Birth" required="required" path="dateofBirth"/></h2>
	  </div>
	  <div>
	  		<h3><form:radiobutton path="gender" value="M" label="Male" />
            <form:radiobutton path="gender" value="F" label="Female" /></h3>
	  </div>
	  <div>
	  		<h2><form:input class="input100" type="text" name="email" placeholder="EmailId" required="required" path="emailId"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="number" name="socialSecurityId" placeholder="Social Security Id" required="required" path="socialSecuirtyId"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="textbox" name="residentialAdreess" placeholder="Residential Address" required="required" path="residentialAdreess"/></h2>
	  </div>
	  <div>
		   <h2><form:input class="input100" type="textbox" name="communicationAdreess" placeholder="Communication Address" required="required" path="communicationAdreess"/></h2>
	  </div>
	  <div>
	  	   <h2><form:input class="input100" type="text" name="contactNumber" placeholder="Contact Number" required="required" path="contactNumber"/></h2>
	  </div>
	  <div>
		   <h2><input class="inputBtn" type="submit" name="Login" placeholder="Create"/></h2>
	  </div>
	  <div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</form:form>      
</div>
</body>
</html>