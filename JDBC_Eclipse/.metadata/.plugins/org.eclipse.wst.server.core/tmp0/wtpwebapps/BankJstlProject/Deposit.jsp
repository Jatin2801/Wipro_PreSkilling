<%@ page language="java" errorPage="Error.jsp" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form method="get" action="Deposit.jsp">
		<center>
			Account No : 
			<input type="number" name="accountNo" /> <br/><br/>
			Deposit Amount : 
			<input type="number" name="depositAmount" /> <br/><br/>
			<input type="submit" value="Deposit Amount" />
		</center>
	</form>
	<c:if test="${param.accountNo !=null && param.depositAmount !=null}">
		<jsp:useBean id="beanAccountsDao" class="com.java.bank.dao.AccountsDaoImpl" />
		<c:set var="accountNo" value="${param.accountNo}" />
		<c:set var="depositAmount" value="${param.depositAmount}" />
		<c:out value="${accountNo}" />
		<c:out value="${depositAmount}" />
		<c:set var="result" value="${beanAccountsDao.depositAccount(accountNo,depositAmount)}" />
		<c:out value="${result}" />
	</c:if>
</body>
</html>