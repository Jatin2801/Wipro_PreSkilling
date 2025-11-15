package com.java.wipro.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.wipro.dao.EmployDao;
import com.java.wipro.dao.EmployDaoImpl;
import com.java.wipro.model.Employ;

public class EmploySearchMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		EmployDao employDao = new EmployDaoImpl();
		try {
			Employ employFound = employDao.searchEmployDao(empno);
			if (employFound !=null) {
				System.out.println(employFound);
			} else {
				System.err.println("Employ Record Not Found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
