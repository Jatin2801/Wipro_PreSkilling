<%@page import="com.java.wipro.dao.EmployDaoImpl"%>
<%@page import="com.java.wipro.dao.EmployDao"%>
<%@page import="com.java.wipro.model.Gender"%>
<%@page import="com.java.wipro.model.Employ"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmployInsert.jsp">
		<center>
			Employ Number : 
			<input type="number" name="empno" /> <br/><br/>
			Employ Name : 
			<input type="text" name="name" /> <Br/><br/>
			Gender : 
			<select name="gender">
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select> <br/> <br/>
			Department : 
			<input type="text" name="dept" /> <br/><br/>
			Designation : 
			<input type="text" name="desig" /> <br/><br/>
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Insert" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			Employ employ = new Employ();
			employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employ.setName(request.getParameter("name"));
			employ.setGender(Gender.valueOf(request.getParameter("gender")));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Double.parseDouble(request.getParameter("basic")));
			EmployDao dao = new EmployDaoImpl();
			out.println(dao.addEmployDao(employ));
		}
	%>
</body>
</html>