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
		String address = (String)request.getAttribute("address");
		String temp = (String)session.getAttribute("temp");
	%>
	
	Welcome= <%=userName %> <br>
	You are living at= <%=address %> <br>
	Temp= <%=temp %>
</body>
</html>