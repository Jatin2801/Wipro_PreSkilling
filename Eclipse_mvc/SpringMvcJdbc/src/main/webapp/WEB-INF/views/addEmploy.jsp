<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="insertFinal">
		<center>
			Employ No : 
			<input type="number" name="empno"  /> 
			<br/><br/>
			Employ Name : 
			<input type="text" name="name"  />
			<br/><br/>
			Gender : 
			<input type="text" name="gender"  />
			<br/><br/>
			Department : 
			<input type="text" name="dept"  />
			<br/><br/>
			Designation : 
			<input type="text" name="desig" />
			<br/><br/>
			Basic : 
			<input type="number" name="basic" />
			<br/><br/>
			
			<input type="submit" value="Insert" />
		</center>
	</form>
</body>
</html>