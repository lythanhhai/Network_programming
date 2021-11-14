package Model.DAO;

import java.util.ArrayList;

import Model.bean.*;

public class CheckUser_DAO {
	
	// kiểm tra 
	public boolean CheckExist_DAO(String Username, String Password)
	{
		return true;
	}
	
	// lấy danh sách user
	public ArrayList<User> getAllUser_DAO(String userName)
	{
		ArrayList<User> listUser = new ArrayList<User>();
		
		User u1 = new User();
		u1.setName("lth");
		u1.setAddress("QT");
		u1.setAlive(true);
		listUser.add(u1);
		
		User u2 = new User();
		u2.setName("lth1");
		u2.setAddress("QT");
		u2.setAlive(true);
		listUser.add(u2);
		
		return listUser;
		
	}
}
