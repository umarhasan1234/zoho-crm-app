<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>
	<h2>Customer Bill</h2>
	<form action="billingPage">
		First Name<input type="text" name="firstName" value="${contact.firstName}"/><br/>
		Last Name<input type="text" name="lastName" value="${contact.lastName}"/><br/>
	     Email<input type="email" name="email" value="${contact.email}"/><br/>
		Mobile<input type="number" name="mobile" value="${contact.mobile}"/><br/>
		Product <input type="text" name="product"><br/>
		Total Bill <input type="number" name="amount" ><br/>
		
		<input type="submit" value="Generate Bill">
		
	</form>
</body>
</html>