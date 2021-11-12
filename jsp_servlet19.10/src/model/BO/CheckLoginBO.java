package model.BO;

import java.sql.SQLException;

import model.Bean.Account;
import model.DAO.CheckLoginDAO;

public class CheckLoginBO {

	public static Account CheckLogin(String id, String pw) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return CheckLoginDAO.CheckLogin(id, pw);
	}

}
