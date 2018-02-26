<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page errorPage="notFound.jsp" %>  
<html>
<head>
	<title>MicroServicesCustomerSearch</title>
	<link rel="stylesheet" href="main.css" type="text/css"></link>
</head>
<body class="backGroundImage" bgcolor="#00c7c7">
<div style="text-align: center;">
<br>
<% String customerId=request.getParameter("name.customerID");%>
<%if(customerId!=null){%>
<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Customer Found</h1></div><br/>
    <div><h2>CustomerId:                  ${name.customerID}</h2></div><br/>
      <div><h2>LastName:                  ${name.lastName}</h2></div><br/>
<div><h2>socialSecuirtyId:            ${name.socialSecuirtyId}</h2></div><br/>
      <div><h2>firstName:                   ${name.firstName}</h2></div><br/>
    <div><h2>dateofBirth:                 ${name.dateofBirth}</h2></div><br/>
         <div><h2>gender:                      ${name.gender}</h2></div><br/>
   <div><h2>contactNumber:               ${name.contactNumber}</h2></div><br/>
<div><h2>emailId:                     ${name.emailId}</h2></div><br/>
<div><h2>communicationAdreess:        ${name.communicationAdreess}</h2></div><br/>
<div><h2>residentialAdreess:          ${name.residentialAdreess}</h2></div><br/><br/><br/>		
<%} else{ %>
	<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Customer Not Found</h1></div><br/><br/><br/><br/><br/><br/>	
<%}%>
<div style="width: 1200px; margin: 0 auto; background: #000; color: #fff;"><h1>Evry India Pvt Ltd</h1></div>
</div>
</body>
</html>