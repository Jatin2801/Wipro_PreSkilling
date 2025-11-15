<%@page import="com.java.wipro.model.Employ"%>
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
	<form method="get" action="EmploySearch.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" /> <br/><br/>
			<input type="submit" value="Search" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!= null) {
			EmployDao dao = new EmployDaoImpl();
			Employ employ = dao.searchEmployDao(Integer.parseInt(request.getParameter("empno")));
			out.println("Employ No  " +employ.getEmpno() + "<Br/>");
			out.println("Employ Name  " +employ.getName() + "<Br/>");
			out.println("Department  " +employ.getDept() + "<Br/>");
			out.println("Designation  " +employ.getDesig() + "<Br/>");
			out.println("Salary  " +employ.getBasic() + "<Br/>");
			out.println("Gender  " +employ.getGender() + "<Br/>");
			
		}
	%>
</body>
</html>