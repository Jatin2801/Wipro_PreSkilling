package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employ;
import com.example.demo.model.Gender;

@Service
public class EmployDaoImpl implements EmployDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employ> showEmployDao() {
		String cmd = "select * from Employ";
		List<Employ> employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(Gender.valueOf(rs.getString("gender")));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		String cmd = "select * from Employ where empno = ?";
		List<Employ> employList = jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(Gender.valueOf(rs.getString("gender")));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		
		Employ employ = null;
		if (employList.size()!=0) {
			employ = employList.get(0);
		}
		return employ;
	}

	@Override
	public String addEmployDao(Employ employ) {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ "values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {
			employ.getEmpno(),
			employ.getName(),
			employ.getGender().toString(),
			employ.getDept(),
			employ.getDesig(),
			employ.getBasic()
		});
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmployDao(Employ employ) {
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, "
				+ " Desig = ?, Basic = ? WHERE Empno = ?";
		jdbcTemplate.update(cmd, new Object[] {
			employ.getName(),
			employ.getGender().toString(),
			employ.getDept(),
			employ.getDesig(),
			employ.getBasic(),
			employ.getEmpno()
		});
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		String cmd = "DELETE From Employ where empno = ?";
		jdbcTemplate.update(cmd, new Object[] {empno});
		return "Employ Record Deleted...";
	}

}
