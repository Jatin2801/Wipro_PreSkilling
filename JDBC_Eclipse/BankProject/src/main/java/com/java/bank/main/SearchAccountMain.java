package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.AccountsDao;
import com.java.bank.dao.AccountsDaoImpl;
import com.java.bank.model.Accounts;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No   ");
		accountNo = sc.nextInt();
		AccountsDao dao = new AccountsDaoImpl();
		try {
			Accounts account = dao.searchAccount(accountNo);
			if (account != null) {
				System.out.println(account);
			} else {
				System.out.println("*** Account No Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
