package com.demo;

public class Emp {
	private int eId;
	private String eName;
	private String []address;
	private long []mo;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public Emp() {
		System.out.println("const calling ...");
	}
	public long[] getMo() {
		return mo;
	}
	public void setMo(long[] mo) {
		this.mo = mo;
	}
	
	
}
