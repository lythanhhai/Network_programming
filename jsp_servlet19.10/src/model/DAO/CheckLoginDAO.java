package model.DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import model.Bean.Account;

public class CheckLoginDAO {

	public static Account CheckLogin(String id, String pw) throws ClassNotFoundException, SQLException {
		//KetNoi CSDL
		
		//Hard Code!!
//		List<Account> l = new ArrayList<Account>();
//		Account a1 = new Account();
//		a1.setId("pmtuan");
//		a1.setPass("123456");
//		a1.setName("Minh Tuan Pham");
//		a1.setSex("Nam");
//		a1.setSt("Vui tinh!!");
//		
//		Account a2 = new Account();
//		a2.setId("cpheo");
//		a2.setPass("123");
//		a2.setName("Chi Pheo");
//		a2.setSex("Nam");
//		a2.setSt("Nhau len la quay!!");
//		
//		Account a3 = new Account();
//		a3.setId("tno");
//		a3.setPass("chaohanh");
//		a3.setName("Thi No");
//		a3.setSex("Nu");
//		a3.setSt("Yeu tham Chi Pheo!!");
//		
//		l.add(a1);
//		l.add(a2);
//		l.add(a3);
//		
//		for (Account a : l) {
//			if (a.getId().equals(id) && a.getPass().equals(pw)){
//				return a;
//			}
//		}
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/ltm19.10";
		String user = "root";
		Connection con = DriverManager.getConnection(url, user, "");
		Statement stm = con.createStatement();

		String sql = "select * from user";
		
		ResultSet rs = 	stm.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int socot = rsmd.getColumnCount();

		
		Account a = new Account();
		while(rs.next())
		{
			if(rs.getString(1).equals(id) && rs.getString(2).equals(pw))
			{
				a.setId(rs.getString(1));
				a.setPass(rs.getString(2));
				a.setName(rs.getString(3));
				a.setSex(rs.getString(4));
				a.setSt(rs.getString(5));
				return a;
			}
		}
		rs.close();
		stm.close();
		return null;
		

	}

}
