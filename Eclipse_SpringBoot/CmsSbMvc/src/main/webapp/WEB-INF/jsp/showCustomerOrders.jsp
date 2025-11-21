<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="customermenu.jsp" /> <br/><br/><hr/>
	<table border="3" align="center">
		<tr>
			<th>Order Id</th>
			<th>Customer Id</th>
			<th>Vendor Id</th>
			<th>Wallet Source</th>
			<th>Menu Id</th>
			<th>Order Date</th>
			<th>Order Quantity</th>
			<th>Bill Amount</th>
			<th>Order Status</th>
			<th>Order Comments</th>
		</tr>
		<c:forEach var="ord" items="${orders}">
			<tr>
				<td>${ord.ordId}</td>
				<td>${ord.cusId}</td>
				<td>${ord.venId}</td>
				<td>${ord.walSource}</td>
				<td>${ord.menId}</td>
				<td>${ord.ordDate}</td>
				<td>${ord.ordQuantity}</td>
				<td>${ord.ordBillAmount}</td>
				<td>${ord.ordStatus}</td>
				<td>${ord.ordComments}</td>
				
				
			</tr>
		</c:forEach>
		<tr>
		</tr>
	</table>
</body>
</html>