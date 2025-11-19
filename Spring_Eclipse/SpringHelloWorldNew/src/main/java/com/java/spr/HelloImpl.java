package com.java.spr;

public class HelloImpl implements Hello {
	
	private String firstGreet;
	private String continueGreet;
	private String actualGreet;
	private String endGreet;
	
	public String getFirstGreet() {
		return firstGreet;
	}
	public void setFirstGreet(String firstGreet) {
		this.firstGreet = firstGreet;
	}
	public String getContinueGreet() {
		return continueGreet;
	}
	public void setContinueGreet(String continueGreet) {
		this.continueGreet = continueGreet;
	}
	public String getActualGreet() {
		return actualGreet;
	}
	public void setActualGreet(String actualGreet) {
		this.actualGreet = actualGreet;
	}
	public String getEndGreet() {
		return endGreet;
	}
	public void setEndGreet(String endGreet) {
		this.endGreet = endGreet;
	}
	
	@Override
	public String show(String name) {
		return firstGreet +  name +continueGreet + "\n  " + 
				actualGreet + " " +endGreet;
	}
	
	
}
