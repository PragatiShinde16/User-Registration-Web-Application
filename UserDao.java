package com.acc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acc.model.User;
import com.acc.util.DBConnection;
import com.mysql.cj.protocol.Resultset;

public class UserDao {
	public static int registerUser(User user) throws ClassNotFoundException{
		
		int result = 0;
		String query = "insert into user1 (f_name, l_name, uname, password, address, contact) values (?, ?, ?, ?, ?, ?);";
		
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
			
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setString(3, user.getUname());
			preparedStatement.setString(4, user.getAddress());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.setString(6, user.getContact());
			result = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	
	public static boolean validateUser(String name, String pass) {
		
		boolean status = false;
		String query1 = "Select * from user1 where uname =? and password =?;";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query1)){
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, pass);
			
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public boolean deleteUser(int uid) throws SQLException{
		
		boolean rowdeleted;
		String query2 = "delete from user1 where uid =?;";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query2)){
			
			preparedStatement.setInt(1, uid);
			rowdeleted = preparedStatement.executeUpdate()>0;
		} 
		return rowdeleted;
	}
	
	public User selectUser(int uid) {
		User user = null;
		String query3 = "select  f_name, l_name, uname,  address, password, " + "contact from user1 where uid = ?;";
		try (Connection connection = DBConnection.getConnection();
	PreparedStatement statement = connection.prepareStatement(query3);){
			statement.setInt(1, uid);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				user = new User(rs.getString("f_name"), rs.getString("l_name"), rs.getString("uname"),rs.getString("address"), rs.getString("password"), rs.getString("contact"));
		}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean updateUser(User user, int id) throws SQLException {
		boolean rowUpdated;
		String query4 = "update user1 set f_name=?, l_name=?, uname=?, address=?, "
				+ "password=?, contact=? where uid = ?;";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query4);) {
			
			preparedStatement.setString(1, user.getFirstname());
			preparedStatement.setString(2, user.getLastname());
			preparedStatement.setString(3, user.getUname());
			preparedStatement.setString(4, user.getAddress());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.setString(6, user.getContact());
			preparedStatement.setInt(7, id);
			System.out.println(preparedStatement);
			rowUpdated = preparedStatement.executeUpdate() > 0;
		}
		return rowUpdated;
	}


}
