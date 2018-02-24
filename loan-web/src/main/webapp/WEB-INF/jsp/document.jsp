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
	<form:form method="POST" action="/addDocument"
		modelAttribute="documents">
		<form:label path="documentId">documentId</form:label>
		<form:input path="documentId" /><br/>

		<form:label path="documentName">documentName</form:label>
		<form:input path="documentName" /><br/>
		
		<form:label path="documentType">documentType</form:label>
		<form:input path="documentType" /><br/>
		
		<form:label path="documentValidFrom">documentValidFrom</form:label>
		<form:input path="documentValidFrom" /><br/>
		
		<form:label path="documentValidTo">documentValidTo</form:label>
		<form:input path="documentValidTo" /><br/>
		
		<form:label path="documentStatus">documentStatus</form:label>
		<form:input path="documentStatus" /><br/>
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>