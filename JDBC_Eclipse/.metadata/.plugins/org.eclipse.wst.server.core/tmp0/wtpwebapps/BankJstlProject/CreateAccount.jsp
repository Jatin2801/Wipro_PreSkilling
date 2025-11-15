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
	<form method="get" action="CreateAccount.jsp">
		<center>
			First Name :
			<input type="text" name="firstName" /> <br/><br/>
			Last Name : 
			<input type="text" name="lastName" /> <br/><br/>
			City :
			<input type="text" name="city" /><br/><br/>
			State :
			<input type="text" name="state" /> <br/><br/>
			Amount : 
			<input type="number" name="amount" /> <br/><br/> 
			Cheq Facility : 
			<select name="cheqFacil">
				<option value="YES">Yes</option>
				<option value="NO">No</option>
			</select> <br/><br/>
			Account Type : 
			<select name="accountType">
				<option value="Savings">Savings</option>
				<option value="Current">Current</option>
			</select> <br/><br/>
			<input type="submit" value="Create Account" />
		</center>
	</form>
	<c:if test="${param.amount !=null}">
	<jsp:useBean id="beanAccountDao" class="com.java.bank.dao.AccountsDaoImpl" />
	<jsp:useBean id="beanAccounts" class="com.java.bank.model.Accounts" />
	<jsp:setProperty property="*" name="beanAccounts"/> 
	<c:out value="${beanAccountDao.createAccount(beanAccounts)}" />
	</c:if>
</body>
</html>