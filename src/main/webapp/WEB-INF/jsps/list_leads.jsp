<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All</title>
</head>
<body>
	<a href="listContacts">  contact List</a>
	<a href="createLeadPage">Create new Lead</a>
	<h2>List All Lead Data</h2>
	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Source</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		
		<c:forEach var="lead" items="${leads}">
			<tr>
				<td><a href="getLead?id=${lead.id}">${lead.firstName}</a></td>
				<td>${lead.lastName}</td>
				<td>${lead.source}</td>
				<td>${lead.email}</td>
				<td>${lead.mobile}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>