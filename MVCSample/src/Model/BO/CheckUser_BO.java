package Model.BO;

import java.util.ArrayList;

import Model.DAO.*;

import Model.bean.*;


public class CheckUser_BO {
	
	CheckUser_DAO checkUser_DAO = new CheckUser_DAO();
	
	public boolean checkUser_BO(String Username, String Password)
	{
		return checkUser_DAO.CheckExist_DAO(Username, Password);
	}
	
	public ArrayList<User> getAllUser_BO(String userName)
	{
		return checkUser_DAO.getAllUser_DAO(userName);
	}
}
