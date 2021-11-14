package model.BO;

import java.sql.SQLException;

import model.DAO.*;

public class Register_BO {
	
	public void InsertUser_BO(String id, String password, String username, String sex, String hobby) throws ClassNotFoundException, SQLException
	{
		Register_DAO register = new Register_DAO();
		register.InsertUser_DAO(id, password, username, sex, hobby);
	}
}
