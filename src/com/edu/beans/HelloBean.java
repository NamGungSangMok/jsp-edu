package com.edu.beans;

public class HelloBean {

	private String name;
	private String number;
	
	public HelloBean() {
		this.name = "이름 없음";
		this.number = "번호 없음";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
