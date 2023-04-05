<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "aqua">
	<center>
		<h1>Registration Form</h1><br>
		<form action = "RegistrationServlet" method = "post">
			<table style = "width: 50%">
				<tr>
					<td>First Name</td>
					<td> <input type = "text" name = "firstname"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td> <input type = "text" name = "lastname"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td> <input type = "text" name = "uname"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td> <input type = "password" name = "password"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td> <input type = "text" name = "address"></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td> <input type = "number" name = "contact"></td>
				</tr>
			</table><br>
			<input type = "submit" value = "submit"><br><br>
		</form>
	</center>
</body>
</html>