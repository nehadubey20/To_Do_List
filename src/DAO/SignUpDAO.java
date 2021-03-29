package DAO;

import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

import Bean.UserBean;
import jdbcConnector.dbConnector;

public class SignUpDAO {
	
	public static boolean insertData(UserBean ub)
	{
		Connection con = dbConnector.getConnection();
		try {
			
			String query = "Insert into todouser(FirstName,LastName,Username,Password,Phone) values (?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, ub.getFname());
			stmt.setString(2, ub.getLname());
			stmt.setString(3, ub.getUsername());
			stmt.setString(4, ub.getPassword());
			stmt.setString(5, ub.getPhone());
			int i = stmt.executeUpdate();
			
			if(i>0)
			{
				return true;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
