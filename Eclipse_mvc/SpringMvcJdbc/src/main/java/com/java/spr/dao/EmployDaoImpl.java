package com.java.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.java.spr.model.Employ;
import com.java.spr.model.Gender;

public class EmployDaoImpl implements EmployDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employ> showEmployDao() {
		 String sql = "SELECT * FROM Employ";
		    List<Employ> listEmploy = jdbcTemplate.query(sql, new RowMapper<Employ>() {
		 
		        @Override
		        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
		            Employ employ = new Employ();
		 
		            employ.setEmpno(rs.getInt("empno"));
		            employ.setName(rs.getString("name"));
		            employ.setGender(Gender.valueOf(rs.getString("gender")));
		            employ.setDept(rs.getString("dept"));
		            employ.setDesig(rs.getString("desig"));
		            employ.setBasic(rs.getInt("basic"));
		 
		            return employ;
		        }
		 
		    });
		 
		    return listEmploy;

	}

	@Override
	public Employ searchEmployDao(int empno) {
		 String sql = "SELECT * FROM Employ where empno = ?";
		    List<Employ> listEmploy = jdbcTemplate.query(sql, new Object[] {empno}, new RowMapper<Employ>() {
		 
		        @Override
		        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
		            Employ employ = new Employ();
		            employ.setEmpno(rs.getInt("empno"));
		            employ.setName(rs.getString("name"));
		            employ.setGender(Gender.valueOf(rs.getString("gender")));
		            employ.setDept(rs.getString("dept"));
		            employ.setDesig(rs.getString("desig"));
		            employ.setBasic(rs.getInt("basic"));
		 
		            return employ;
		        }
		 
		    });
		 
		    return listEmploy.get(0);
	}

	@Override
	public String updateEmployDao(Employ employ) {
		String cmd = "update employ set name = ?, Gender = ?, Dept = ?, "
				+ " Desig =?, Basic = ? WHERE Empno = ?";
		jdbcTemplate.update(cmd, new Object[] {
				 employ.getName(),
				employ.getGender().toString(), employ.getDept(), 
				employ.getDesig(), employ.getBasic(),employ.getEmpno() 
		});
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		String cmd = "Delete from Employ where empno = ?";
		jdbcTemplate.update(cmd, new Object[] {empno});
		return "Employ Record Deleted...";
	}

	@Override
	public String addEmployDao(Employ employ) {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {
				employ.getEmpno() , employ.getName(),
				employ.getGender().toString(), employ.getDept(), 
				employ.getDesig(), employ.getBasic()
		});
		return "Employ Record Inserted...";
	}

}
