package com.demo;

public class Employee {
	
	public Employee() {
		System.out.println("   Employee Const calling .........");
	}
	
	private int id;
	private String name;
	Address addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
