package com.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.DTO.UserDTO;
import com.Util.JDBCUtil;

public class UserService {

	
		public int registerUser(UserDTO user) throws SQLException{
			Connection connection = null;
			PreparedStatement preStat = null;
			
			String insertSQL = "INSERT INTO users(fullname,gender,contact_no,email,password)VALUES(?,?,?,?,?)";
			int result = 0;
			
			try {
				connection = JDBCUtil.getConnection();
				preStat = connection.prepareStatement(insertSQL);
				preStat.setString(1, user.getfullName());
				preStat.setString(2, user.getGender());
				preStat.setString(3, user.getContactNo());
				preStat.setString(4, user.getEmail());
				preStat.setString(5, user.getPassword());
				
				System.out.println(preStat);
				
				result = preStat.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			return result;
		}
}
