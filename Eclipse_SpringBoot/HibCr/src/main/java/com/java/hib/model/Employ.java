package com.java.hib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries
(
	{
		@NamedQuery( 
			name="showEmploy",
			query="from Employ"
			),
		@NamedQuery( 
			name="searchEmploy",
			query="from Employ where empno=:empno"
			)
	}
)
@Entity
@Table(name="Employ")
public class Employ {
	
	@Id
	@Column(name="empno")
	private int empno;
	@Column(name="name")
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(name="gender")
	private Gender gender;
	@Column(name="dept")
	private String dept;
	@Column(name="desig")
	private String desig;
	@Column(name="basic")
	private double basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + "]";
	}
	
	
}
