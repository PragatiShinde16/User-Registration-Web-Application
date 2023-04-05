package com.acc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acc.dao.UserDao;

@WebServlet("/DeleteUserServ1")
public class DeleteUserServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserDao userDao;
    public DeleteUserServ1() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		userDao = new UserDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter obj = response.getWriter();
		
		boolean status = false;
		int id = Integer.parseInt(request.getParameter("uid"));
		try {
			status = userDao.deleteUser(id);
			if (status) {
				response.sendRedirect("ListUsers.jsp");
			}else {
				obj.print("No user with requested id:"+id+"in system");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
