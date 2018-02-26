<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>MicroServicesDocumentCreate</title>
	<link rel="stylesheet" href="main.css" type="text/css"></link>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
<br>
<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Document Created Successfully</h1></div><br/>
	<div><h2>FirstName:${name.documentId}</h2></div><br/>
	<div><h2>LastName:${name.documentName}</h2></div><br/>
	<div><h2>documentType:${name.documentType}</h2></div><br/>
	<div><h2>ValidFrom:${name.documentValidFrom}</h2></div><br/>
	<div><h2>documentValid:${name.documentValidTo}</h2></div><br/>
	<div><h2>status:${name.documentStatus}</h2></div><br/><br/>
	<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</div>
</body>
</html>