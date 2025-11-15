package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.AccountsDao;
import com.java.bank.dao.AccountsDaoImpl;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo;
		double depositAmount;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account No  ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount  ");
		depositAmount = sc.nextDouble();
		AccountsDao dao = new AccountsDaoImpl();
		try {
			System.out.println(dao.depositAccount(accountNo, depositAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
