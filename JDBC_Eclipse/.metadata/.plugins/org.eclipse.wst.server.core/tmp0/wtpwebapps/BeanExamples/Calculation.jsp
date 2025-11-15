<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Calculation.jsp">
		<center>
			First Number : 
			<input type="number" name="firstNo" /> <br/><br/>
			Second Number : 
			<input type="number" name="secondNo" /> <br/><br/>
			<input type="submit" value="Calculation" />
		</center>
	</form>
	<%
		if (request.getParameter("firstNo")!=null && 
				request.getParameter("secondNo") !=null
				) {
	%>
		<jsp:useBean id="beanCalc" class="com.java.wipro.Calculation" />
		<jsp:setProperty property="*" name="beanCalc"/>
		First Number :
		<b>
			<jsp:getProperty property="firstNo" name="beanCalc"/>
		</b> <br/><br/>
		Second Number : 
		<b>
			<jsp:getProperty property="secondNo" name="beanCalc"/>
		</b> <br/><br/> 
		Sum : <b>
			<%=beanCalc.sum() %>
		</b> <br/><br/> 
		Sub : <b>
			<%=beanCalc.sub() %>
		</b> <br/><br/>
		Mult : <b>
			<%=beanCalc.mult() %>
		</b>
	<%
		}
	%>
</body>
</html>