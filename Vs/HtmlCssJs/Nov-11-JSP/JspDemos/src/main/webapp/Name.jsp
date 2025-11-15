<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Name.jsp">
		<center>
			First Name : 
			<input type="text" name="firstName" /><br/><br/>
			Last Name : 
			<input type="text" name="lastName"/> <br/><br/>
			<input type="submit" value="Show" /> 
		</center>
	</form>
	<%
		if (request.getParameter("firstName")!=null && request.getParameter("lastName")!=null) {
			String fullName = request.getParameter("firstName") + " " +
				request.getParameter("lastName");
			out.println("Full Name   " +fullName);
		}
	%>
</body>
</html>