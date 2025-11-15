<%@page import="com.java.lms.model.Employee"%>
<%@page import="java.util.List"%>
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
		List<Employee> employeeList = dao.showEmployeeDao();
	%>
	<table border="3" align="center">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Email</th>
			<th>Employee Mobile No</th>
			<th>Employee Date Of Join</th>
			<th>Employee Department</th>
			<th>Employee Manager Id</th>
			<th>Employee Leave Balance</th>
			<th>Dash Board</th>
		</tr>
		<%
			for(Employee employee : employeeList) {
		%>
			<tr>
				<td><%=employee.getEmpId() %> </td>
				<td><%=employee.getEmpName() %> </td>
				<td><%=employee.getEmpEmail() %> </td>
				<td><%=employee.getEmpMobNo() %> </td>
				<td><%=employee.getEmpDtJoin() %> </td>
				<td><%=employee.getEmpDept() %> </td>
				<td><%=employee.getEmpManagerId() %> </td>
				<td><%=employee.getEmpAvailLeaveBal() %> </td>
				<td> 
					<a href=DashBoard.jsp?empId=<%=employee.getEmpId() %>&mgrId=<%=employee.getEmpManagerId() %> >Dash Board</a>
				</td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>