package com.java.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.lms.model.Employee;
import com.java.lms.util.ConnectionHelper;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection connection;
	PreparedStatement psmt;
	
	@Override
	public List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = null;
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setEmpManagerId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public Employee searchEmployeeDao(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee where Emp_ID = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empId);
		ResultSet rs = psmt.executeQuery();
		Employee employee = null;
		if (rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setEmpManagerId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
		}
		return employee;
	}

}
