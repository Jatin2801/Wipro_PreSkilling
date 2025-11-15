package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.AccountsDao;
import com.java.bank.dao.AccountsDaoImpl;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		int accountNo;
		double withdrawAmount;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account No  ");
		accountNo = sc.nextInt();
		System.out.println("Enter Withdraw Amount  ");
		withdrawAmount = sc.nextDouble();
		AccountsDao dao = new AccountsDaoImpl();
		try {
			System.out.println(dao.withdrawAccount(accountNo, withdrawAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
