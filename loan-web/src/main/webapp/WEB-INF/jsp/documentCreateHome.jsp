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
		<form:form method="POST" action="/addDocument"
			modelAttribute="documents">
			<div
				style="width: 1200px; margin: 0 auto; background: #000; color: #fff;">
				<h1>Document Create</h1>
			</div>
			<div>
				<h2>
					<form:input class="input100" type="number" name="documentId"
						placeholder="Document Id" required="required" path="documentId" />
				</h2>
			</div>
			<div>
				<h2>
					<form:input class="input100" type="number" name="customerId"
						placeholder="Customer Id" required="required" path="customerId" />
				</h2>
			</div>
			<div>
				<h2>
					<form:input class="input100" type="string" name="documentName"
						placeholder="Document Name" required="required"
						path="documentName" />
				</h2>
			</div>
			<!-- <div>
				<h2>
					<form:input class="input100" type="string" name="documentType"
						placeholder="Document Type" required="required"
						path="documentType" />
				</h2>
			</div> -->
			<div>
				<form:select path="documentType">
					<form:option value="NONE" label="Select" />
					<form:options items="${documentType}" />
				</form:select>

			</div>
			<div>
				<h2>
					<form:input class="input100" type="date" name="documentValidFrom"
						placeholder="Document Valid From" required="required"
						path="documentValidFrom" />
				</h2>
			</div>
			<div>
				<h2>
					<form:input class="input100" type="date" name="documentValidTo"
						placeholder="Document Valid To" required="required"
						path="documentValidTo" />
				</h2>
			</div>
			<div>
				<form:select path="documentStatus">
					<form:option value="VERIFIEDorSUBMITTED" label="VERIFIEDorSUBMITTED" />					
				</form:select>


			</div>
			<div>
				<input class="inputBtn" type="submit" value="Submit" />
			</div>
			<br />
			<br />
			<div
				style="width: 1200px; margin: 0 auto; background: #000; color: #fff;">
				<h1>Evry India Pvt Ltd</h1>
			</div>
		</form:form>
	</div>
</body>
</html>