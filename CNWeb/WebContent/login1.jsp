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
			String temp = "temp";
			session.setAttribute("temp", temp);
		%>
		<form name="form1" action="checkLogin1.jsp" method="post"> 
			Username: <input name="userName" type="text"/>
			Password: <input name="passWord" type="password"/>
			<input name="login" type="submit"/>
			<input name="reset" type="reset"/>
		</form>
</body>
</html>