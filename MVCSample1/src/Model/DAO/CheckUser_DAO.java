package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.bean.*;

public class CheckUser_DAO {
	
	// kiểm tra 
	public boolean CheckExist_DAO(String Username, String Password)
	{
		return true;
	}
	
	// lấy danh sách user
	public ArrayList<User> getAllUser_DAO(String userName) throws ClassNotFoundException, SQLException
	{
		ArrayList<User> listUser = new ArrayList<User>();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/mvc_cnweb";
			String user = "root";
			Connection con = DriverManager.getConnection(url, user, "");
			Statement stm = con.createStatement();
			
			String sql = "select * from user";
			
			ResultSet rs = 	stm.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int socot = rsmd.getColumnCount();
			
			while(rs.next())
			{
				User u = new User();
				u.setName(rs.getString(1));
				u.setAddress(rs.getString(2));
				u.setAlive(rs.getBoolean(3));
				listUser.add(u);
			}
			rs.close();
			stm.close();
		}
		catch(Exception err)
		{
			
		}
		return listUser;
	}
}

//ArrayList<User> listUser = new ArrayList<User>();
//
//User u1 = new User();
//u1.setName("lth");
//u1.setAddress("QT");
//u1.setAlive(true);
//listUser.add(u1);
//
//User u2 = new User();
//u2.setName("lth1");
//u2.setAddress("QT");
//u2.setAlive(true);
//listUser.add(u2);
//
//return listUser;
