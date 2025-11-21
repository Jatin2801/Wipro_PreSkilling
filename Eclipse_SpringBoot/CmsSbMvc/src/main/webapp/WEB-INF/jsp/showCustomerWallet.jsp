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
			<th>Wallet Id</th>
			<th>Customer Id</th>
			<th>Wallet Amount</th>
			<th>Wallet Source</th>
		</tr>
	<c:forEach var="wallet" items="${wallets}">
			<tr>
				<td>${wallet.walId} </td>
					<td>${wallet.cusId} </td>
						<td>${wallet.walAmount} </td>
							<td>${wallet.walSource} </td>
				
			</tr>
	</c:forEach>
	</table>
</body>
</html>