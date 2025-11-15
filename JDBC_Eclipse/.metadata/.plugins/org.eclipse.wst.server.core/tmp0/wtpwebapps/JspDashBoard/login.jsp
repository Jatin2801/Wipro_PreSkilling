<%@page import="com.java.wipro.dao.EmployDaoImpl"%>
<%@page import="com.java.wipro.dao.EmployDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passWord"/> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && request.getParameter("passWord")!=null) {
			String user = request.getParameter("userName");
			String pwd = request.getParameter("passWord");
			EmployDao dao = new EmployDaoImpl();
			int count = dao.login(user, pwd);
			if (count==1) {
	%>
		<jsp:forward page="EmployTable.jsp" />
	<%
			} else {
				out.println("Invalid Credentials...");
			}
		}
	%>
</body>
</html>