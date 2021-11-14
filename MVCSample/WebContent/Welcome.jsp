<%@ page import="java.util.*" %>
<%@ page import="Model.bean.User" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<%
		ArrayList<User> listUser = (ArrayList<User>)request.getAttribute("listUser");
		for(int i = 0 ; i < listUser.size() ; i++)
		{
	%>
		<tr>
			<td>
				<%=
						listUser.get(i).getName()
				%>
			</td>
			<td>
				<%=
						listUser.get(i).getAddress()
				%>
			</td>
			<td>
				<%=
						listUser.get(i).getAlive()
				%>
			</td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>