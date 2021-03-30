package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

import Bean.LoginBean;
import jdbcConnector.dbConnector;

public class LoginDAO {
	
	public static boolean validate(LoginBean lb) throws ClassNotFoundException
	{
		boolean status=false;
		
		try {
			Connection con = dbConnector.getConnection();
			String query = "Select * from todouser where username=? and password=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, lb.getUsername());
			stmt.setString(2, lb.getPassword());
			
			ResultSet rs= stmt.executeQuery();
			status = rs.next();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

}
