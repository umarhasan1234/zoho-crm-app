<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts All</title>
</head>
<body>
		<a href="listall">lead List</a>
		<a href="createLeadPage">  Create new Lead</a>
	<h2>List All Contacts Data</h2>
	<table border>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Source</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Bill</th>
		</tr>
		
		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td><a href="getContact?id=${contact.id}">${contact.firstName}</a></td>
				<td>${contact.lastName}</td>
				<td>${contact.source}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td><a href="getBilling?id=${contact.id}">generate bill</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>