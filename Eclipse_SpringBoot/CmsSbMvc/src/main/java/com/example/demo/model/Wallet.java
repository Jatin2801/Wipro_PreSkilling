package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Wallet")
public class Wallet {

	
	@Column(name="CUS_ID")
	private int cusId;
	@Id
	@Column(name="WAL_ID")
	private int walId;
	@Column(name="WAL_AMOUNT")
	private double walAmount;
	@Column(name="WAL_SOURCE")
	private String walSource;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getWalId() {
		return walId;
	}
	public void setWalId(int walId) {
		this.walId = walId;
	}
	public double getWalAmount() {
		return walAmount;
	}
	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public Wallet() {
		// TODO Auto-generated constructor stub
	}
	public Wallet(int cusId, int walId, double walAmount, String walSource) {
		this.cusId = cusId;
		this.walId = walId;
		this.walAmount = walAmount;
		this.walSource = walSource;
	}
	
	
}