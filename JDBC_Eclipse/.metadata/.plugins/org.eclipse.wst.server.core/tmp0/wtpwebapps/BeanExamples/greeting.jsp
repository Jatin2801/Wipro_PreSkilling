<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="beanGreeting" class="com.java.wipro.Greeting" />
	Default Message is : 
	<b>
		<jsp:getProperty property="message" name="beanGreeting"/>
	</b>
	<jsp:setProperty property="message" name="beanGreeting" value="Good Afternoon..."/>
	<br/><br/>
	Updated Message is : 
	<jsp:getProperty property="message" name="beanGreeting"/>
</body>
</html>