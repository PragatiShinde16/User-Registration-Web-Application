<%@page import="com.acc.model.User, com.acc.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "aqua">
	<% UserDao  userdao = new UserDao();
	int id = Integer.parseInt(request.getParameter("uid"));
	User user = userdao.selectUser(id);
	%>
	
	<center>
		<h1 style="color:slateblue"> Update User Form</h1>
		<form action="UpdateSuccess.jsp" method ="post">
			<table  style="width:50%">
				<tr>
					<td><input type="hidden" name="uid" value="<%=id %>"/></td>
				</tr>
				<tr>
				<td>First Name</td>
					<td><input type="text" name="firstname" value="<%=user.getFirstname() %>"/></td>
				</tr>
				<tr>
				<td>Last Name</td>
					<td><input type="text" name="lastname" value="<%=user.getLastname() %>"/></td>
				</tr>
				<tr>
				<td>User Name</td>
					<td><input type="text" name="uname" value="<%=user.getUname() %>"/></td>
				</tr>
				<tr>
				<td>Password</td>
					<td><input type="password" name="password" value="<%=user.getPassword() %>"/></td>
				</tr>
				<tr>
				<td>Address</td>
					<td><input type="text" name="address" value="<%=user.getAddress() %>"/></td>
				</tr>
				<tr>
				<td>Contact</td>
					<td><input type="text" name="contact" value="<%=user.getContact() %>"/></td>
				</tr>
			</table><br />
			<input type="submit" value="Update"/><br /><br />
		</form>
</center>
	
</body>
</html>