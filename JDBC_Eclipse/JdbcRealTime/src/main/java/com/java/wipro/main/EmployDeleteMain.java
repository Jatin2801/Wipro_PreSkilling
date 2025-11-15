package com.java.wipro.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.wipro.dao.EmployDao;
import com.java.wipro.dao.EmployDaoImpl;

public class EmployDeleteMain {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		EmployDao employDao = new EmployDaoImpl();
		try {
			System.out.println(employDao.deleteEmployDao(empno));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
