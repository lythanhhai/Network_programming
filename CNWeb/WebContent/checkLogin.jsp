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
		if("admin".equals(userName) && "123456".equals(passWord))
		{
			request.setAttribute("address", address);
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else 
		{
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>