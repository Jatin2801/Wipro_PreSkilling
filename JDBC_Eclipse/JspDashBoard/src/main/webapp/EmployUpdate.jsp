<%@page import="com.java.wipro.model.Gender"%>
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
	<%
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDao dao = new EmployDaoImpl();
		Employ employ = dao.searchEmployDao(empno);
	%>
	<form method="get" action="EmployUpdate.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" value=<%=employ.getEmpno() %> /> <br/><br/>
			Employ Name : 
			<input type='text' name="name" value=<%=employ.getName() %> /> <br/><br/> 
			Gender : 
			<input type="text" name="gender" value=<%=employ.getGender() %> /> <br/><br/>
			Department : 
			<input type="text" name="dept" value=<%=employ.getDept() %> /> <br/><br/>
			Designation : 
			<input type="text" name="desig" value=<%=employ.getDesig() %> /> <br/><br/>
			Basic : 
			<input type="number" name="basic" value=<%=employ.getBasic() %> /> <br/><br/>
			<input type="submit" value="Update" />
		</center>
	</form>
	<%
		if (request.getParameter("empno") !=null && request.getParameter("basic")!=null) {
			Employ employUpdated = new Employ();
			employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employUpdated.setName(request.getParameter("name"));
			employUpdated.setGender(Gender.valueOf(request.getParameter("gender")));
			employUpdated.setDept(request.getParameter("dept"));
			employUpdated.setDesig(request.getParameter("desig"));
			employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
			out.println(dao.updateEmployDao(employUpdated));
		%>
			<jsp:forward page="EmployTable.jsp" />
		<%
		}
	%>
</body>
</html>