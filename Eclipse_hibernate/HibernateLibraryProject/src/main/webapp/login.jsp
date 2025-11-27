
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.java.hibernatelibraryproject.resources.MainProg" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <jsp:useBean id="bean1" class="com.java.hibernatelibraryproject.resources.LibUsers"/>
	<jsp:setProperty property="*" name="bean1" />
	
	<%
		MainProg obj=new MainProg();
		
		int i=obj.loginCheck(bean1);  
		if(i==0)  {
		out.print("Invalid Credentials...."); 
	%>
		<jsp:include page="login.jsp" />
	<%
		}
		else{
			session.setAttribute("user",bean1.getUsername());
			
	%>
		<jsp:include page="menu.jsp"></jsp:include>
	<%
		}
	%>
</body>
</html>