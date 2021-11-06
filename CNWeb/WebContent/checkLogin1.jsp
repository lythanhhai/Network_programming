
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.lang.String" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String address = "54 Nguyen Luong Bang";
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/dulieu1";
		String user = "root";
		Connection con = DriverManager.getConnection(url, user, "");
		Statement stm = con.createStatement();
		
		
		String sql = "select * from admin";
		
		ResultSet rs = 	stm.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int socot = rsmd.getColumnCount();
		int isExist = 0;
		while(rs.next())
		{
			if((rs.getString(1)).equals(userName) && (rs.getString(2)).equals(passWord))
			{
				isExist++;
				break;
			}
		}
		if(isExist > 0)
		{
			request.setAttribute("address", address);
			RequestDispatcher rd = request.getRequestDispatcher("Welcome1.jsp");
			rd.forward(request, response);
			isExist = 0;
		}
		else 
		{
			response.sendRedirect("login1.jsp");
		}
		
		
		
		rs.close();
		stm.close();
	%>
</body>
</html>