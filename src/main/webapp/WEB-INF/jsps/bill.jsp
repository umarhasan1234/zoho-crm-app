<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchased Bill</title>
</head>
<body>
<a href="createLeadPage">Create new Lead</a><br/><br/>
	    Name :- ${bill.firstName} 
		${bill.lastName}<br/>
		Email :- ${bill.email}<br/>
		Mobile :- ${bill.mobile}<br/>
		Product :- ${bill.product}<br/>
		Total Amount :- ${bill.amount}<br/>
		
</body>
</html>