package Model.BO;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.DAO.*;

import Model.bean.*;


public class CheckUser_BO {
	
	CheckUser_DAO checkUser_DAO = new CheckUser_DAO();
	
	public boolean checkUser_BO(String Username, String Password)
	{
		return checkUser_DAO.CheckExist_DAO(Username, Password);
	}
	
	public ArrayList<User> getAllUser_BO(String userName) throws ClassNotFoundException, SQLException
	{
		return checkUser_DAO.getAllUser_DAO(userName);
	}
	
	public void insert_BO(String name, String address, boolean Alive) throws ClassNotFoundException, SQLException
	{
		checkUser_DAO.insert_DAO(name, address, Alive);
	}
}
