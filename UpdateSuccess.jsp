<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="com.acc.dao.UserDao,java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<jsp:useBean id="user" class="com.acc.model.User"/>
	<jsp:setProperty property="*" name="user"/>
		<%   int id = Integer.parseInt(request.getParameter("uid")); 
       		UserDao userDao = new UserDao();
          	boolean status = false;  		
		  	try {
			 	status= userDao.updateUser(user,id);
				if(status){ 
					response.sendRedirect("ListUsers.jsp");	
				}   			
			} catch (SQLException e) {			
				e.printStackTrace();
			}   	
       	%>
	
</body>
</html>