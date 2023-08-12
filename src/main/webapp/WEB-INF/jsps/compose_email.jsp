<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email </title>
</head>
<body>
	 <form action="sendEmail" method="post">
	 	<pre>
		    To <input type="text" name="to" value="${email}"/>
			Subject <input type="text" name="sub"/>
			Compose :
			<textarea rows="10" cols="5" name="emailBody"></textarea>
			<input type="submit" value="send Email"/>
	 	
	 	</pre>
	 	
	 </form>
	
</body>
</html>