package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.model.Accounts;

public interface AccountsDao {
	String createAccount(Accounts account) throws ClassNotFoundException, SQLException;
	Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException;
}
