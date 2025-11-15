<%@page import="com.java.lms.model.Employee"%>
<%@page import="com.java.lms.dao.EmployeeDaoImpl"%>
<%@page import="com.java.lms.dao.EmployeeDao"%>
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
	EmployeeDao dao = new EmployeeDaoImpl();
	Employee employee = dao.searchEmployeeDao(Integer.parseInt(request.getParameter("empId")));
	Employee manager = dao.searchEmployeeDao(Integer.parseInt(request.getParameter("mgrId")));
%>
	<table border="3" align="center">
		<tr>
			<th>My Details </th>
			<th> My Manager Details</th>
		</tr>
		<tr>
			<td> 
				Employee Id : <b><%=employee.getEmpId() %> </b> <br/> <br/>
				Employee Name : <b><%=employee.getEmpName() %> </b> <br/> <br/>
				Employee Email : <b><%=employee.getEmpEmail() %> </b> <br/><br/>
				Employee Mobile No : <b><%=employee.getEmpMobNo() %></b> <br/><br/>
				Employee Date Of Join : <b><%=employee.getEmpDtJoin() %> </b> <br/><br/>
				Employee Department : <b><%=employee.getEmpDept() %> </b> <br/><br/>
				Employee Manager Id : <b><%=employee.getEmpManagerId() %> </b> <br/><br/>
				Employee Leave Balance : <b><%=employee.getEmpAvailLeaveBal() %> </b> <br/><br/>
				
			</td>
			<td>
				Manager Id : <b><%=manager.getEmpId() %> </b> <br/> <br/>
				Manager Name : <b><%=manager.getEmpName() %> </b> <br/> <br/>
				Manager Email : <b><%=manager.getEmpEmail() %> </b> <br/><br/>
				Manager Mobile No : <b><%=manager.getEmpMobNo() %></b> <br/><br/>
				Manager Date Of Join : <b><%=manager.getEmpDtJoin() %> </b> <br/><br/>
				Manager Department : <b><%=manager.getEmpDept() %> </b> <br/><br/>
			    Manager Id : <b><%=manager.getEmpManagerId() %> </b> <br/><br/>
				Manager Leave Balance : <b><%=manager.getEmpAvailLeaveBal() %> </b> <br/><br/>
			</td>
		</tr>
	</table>
</body>
</html>