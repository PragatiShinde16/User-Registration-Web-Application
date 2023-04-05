<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "pink">
	<center>
		<b>Welcome <% out.println(request.getAttribute("fname")+"<br>"+"Registered Successfully !!"); %></b>
		<h2><a href = "LoginForm.jsp">Login</a></h2>
	</center>
</body>
</html>