<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body bgcolor = "pink">
	<center>
		<h2><a href = "Registration.jsp">Create User</a></h2>
	</center>
	<sql:setDataSource var = "myds"
	driver = "com.mysql.cj.jdbc.Driver"
	url = "JDBC:mysql://localhost:3306/usdb?useSSL = false"
	user = "root"
	password = "pagu@16"/>
	
	<sql:query var = "listUsers" dataSource = "${myds}">
	select * from user1;
	</sql:query>
	
	<div align = "center">
		<table border = "1" cellpadding = "5" bgcolor = "Lightgreen">
			<caption>List of Users</caption>
			<tr bgcolor = "skyblue">
				<th>UserId</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>UserName</th>
				<th>Password</th>
				<th>Address</th>
				<th>Contact</th>
				<th>Action</th>
				<th>Action</th>
			</tr>
			
			<c:forEach var = "user" items = "${listUsers.rows}">
			<tr>
				<td><c:out value = "${user.uid}"/></td>
				<td><c:out value = "${user.f_name}"/></td>
				<td><c:out value = "${user.l_name}"/></td>
				<td><c:out value = "${user.uname}"/></td>
				<td><c:out value = "${user.password}"/></td>
				<td><c:out value = "${user.address}"/></td>
				<td><c:out value = "${user.contact}"/></td>
				
				<td><a href = "UpdateUserForm.jsp?uid=<c:out value = '${user.uid}'/>">Update</a></td>
				<td><a href = "DeleteUserServ1?uid=<c:out value = '${user.uid}'/>">Delete</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>