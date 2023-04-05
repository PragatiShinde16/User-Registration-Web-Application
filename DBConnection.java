package com.acc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("JDBC:mysql://localhost:3306/usdb?useSSL = false", "root", "pagu@16");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}catch (SQLException e) {
	
			e.printStackTrace();
		}
		return con;
	}
}
