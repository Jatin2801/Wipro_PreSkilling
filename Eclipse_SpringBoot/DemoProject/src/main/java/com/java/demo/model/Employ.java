package com.java.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
}
