<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SearchCustomer Information</title>
</head>
<body>
	<form:form method="POST" action="/searchCustomer"
		modelAttribute="search">
		<form:label path="lastName">lastName</form:label>
		<form:input path="lastName" /><br/>

		<form:label path="socialSecuirtyId">socialSecuirtyId</form:label>
		<form:input path="socialSecuirtyId" /><br/>
		
			
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>