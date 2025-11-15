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
<form method="get" action="Withdraw.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Deposit Amount : 
			<input type="number" name="withdrawAmount" /> <br/><br/>
			<input type="submit" value="Withdraw Amount" />
		</center>
	</form>
	<c:if test="${param.accountNo !=null && param.withdrawAmount !=null}">
		<jsp:useBean id="beanAccountsDao" class="com.java.bank.dao.AccountsDaoImpl" />
		<c:set var="accountNo" value="${param.accountNo}" />
		<c:set var="withdrawAmount" value="${param.withdrawAmount}" />
		<c:out value="${accountNo}" />
		<c:out value="${withdrawAmount}" />
		<c:set var="result" value="${beanAccountsDao.withdrawAccount(accountNo,withdrawAmount)}" />
		<c:out value="${result}" />
	</c:if>
</body>
</html>