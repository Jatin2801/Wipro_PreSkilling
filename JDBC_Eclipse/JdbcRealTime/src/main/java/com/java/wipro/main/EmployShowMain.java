package com.java.wipro.main;

import java.sql.SQLException;
import java.util.List;

import com.java.wipro.dao.EmployDao;
import com.java.wipro.dao.EmployDaoImpl;
import com.java.wipro.model.Employ;

public class EmployShowMain {
	public static void main(String[] args) {
		EmployDao employDao = new EmployDaoImpl();
		try {
			List<Employ> employList = employDao.showEmployDao();
			System.out.println(employList.size());
			employList.forEach(x -> {
				System.out.println(x);
			});
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
