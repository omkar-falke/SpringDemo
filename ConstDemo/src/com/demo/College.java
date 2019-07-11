package com.demo;

public class College {

	private int cId;
	private String cName;
	private String cadd;
	

	public College(int cId, String cName, String cadd) {
		this.cId = cId;
		this.cName = cName;
		this.cadd = cadd;
	}
	public void showData() {
		System.out.println(cId+"\n"+cName+"\n"+cadd);
	}
	
	
}
