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
	<form method="get" action="SearchAccount.jsp">
		<center>
			Account No : 
			<input type="text" name="accountNo" /> <br/><br/>
			<input type="submit" value="Search" /> <br/><br/><hr/>
		</center>
	</form>
	<c:if test="${param.accountNo !=null}">
	<center>
		<c:set var="accountNo" value="${param.accountNo}" />
		<jsp:useBean id="beanAccountsDao" class="com.java.bank.dao.AccountsDaoImpl" />
		<c:set var="accounts" value="${beanAccountsDao.searchAccount(accountNo)}" />
		First Name : <b>
			<c:out value="${accounts.firstName}" />
		 </b> <br/><br/>
		 Last Name : <b>
			<c:out value="${accounts.lastName}" />
		 </b> <br/><br/>
		 City : <b>
			<c:out value="${accounts.city}" />
		 </b> <br/><br/>
		 State : <b>
			<c:out value="${accounts.state}" />
		 </b> <br/><br/>
		 Amount : <b>
			<c:out value="${accounts.amount}" />
		 </b> <br/><br/>
		 Cheque Facility : <b>
			<c:out value="${accounts.cheqFacil}" />
		 </b> <br/><br/>
		 Account Type : <b>
			<c:out value="${accounts.accountType}" />
		 </b> <br/><br/>
	</center>
	</c:if>
</body>
</html>