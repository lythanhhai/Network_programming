<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="CheckLoginServlet" method="post">
		ID: <input type="text" name="userName"><br>
		PW: <input type="password" name="passWord"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>