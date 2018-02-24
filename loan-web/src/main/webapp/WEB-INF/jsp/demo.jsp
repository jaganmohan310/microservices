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
	<form:form method="POST" action="/createCustomer"
		modelAttribute="customer">
		<form:label path="firstName">firstName</form:label>
		<form:input path="firstName" />

		<form:label path="lastName">lastName</form:label>
		<form:input path="lastName" />
		
		<form:label path="dateofBirth">dateofBirth</form:label>
		<form:input path="dateofBirth" />
		
		<form:label path="gender">gender</form:label>
		<form:input path="gender" />
		
		<form:label path="contactNumber">contactNumber</form:label>
		<form:input path="contactNumber" />
		
		<form:label path="emailId">emailId</form:label>
		<form:input path="emailId" />
		
		<form:label path="socialSecuirtyId">socialSecuirtyId</form:label>
		<form:input path="socialSecuirtyId" />
		
		<form:label path="residentialAdreess">residentialAdreess</form:label>
		<form:input path="residentialAdreess" />
		
		<form:label path="communicationAdreess">communicationAdreess</form:label>
		<form:input path="communicationAdreess" />

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>