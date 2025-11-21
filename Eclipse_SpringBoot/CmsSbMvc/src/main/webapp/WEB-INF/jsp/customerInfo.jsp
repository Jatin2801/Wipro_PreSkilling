<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="customermenu.jsp" /> <br/><br/><hr/>
	<p> Customer Info Page</p>
	<p> Customer Id : ${customer.cusId} </p>
	<p>Customer Name : ${customer.cusName}</p>
	<p>Customer Phone No : ${customer.cusPhnNo}</p>
	<p>Customer User Name : ${customer.cusUserName}</p>
	<p>Customer Email : ${customer.cusEmail}</p>
</body>
</html>