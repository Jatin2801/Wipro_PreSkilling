<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Test.jsp">
		<center>
			Student Name : 
			<input type="text" name="sname" /> <br/><br/>
			<input type="submit" value="Show" />
		</center>
	</form>
	<%
		if (request.getParameter("sname") != null) {
	%>
		<jsp:useBean id="beanTest" class="com.java.wipro.Test" />
		<jsp:setProperty property="sname" name="beanTest"/>
		Student Name is : <b>
			<jsp:getProperty property="sname" name="beanTest"/>
		</b>
	<%
		}
	%>
</body>
</html>