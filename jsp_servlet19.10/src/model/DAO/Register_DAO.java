package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import model.Bean.*;

public class Register_DAO {
	
	public void InsertUser_DAO(String id, String password, String username, String sex, String hobby) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/ltm19.10";
		String user = "root";
		Connection con = DriverManager.getConnection(url, user, "");
		Statement stm = con.createStatement();
		String sql = "Insert into user values(" + id + "," + password + "," + username + "," + sex + "," + hobby + ")";
		//ResultSet rs = 	stm.executeQuery(sql);
		stm.executeUpdate(sql);
	}
}
