package com.test;

public class Dept {
	private int did;
	private String dname;
	private College c;
	
	
	public Dept(int did,String dname,College c) {
		
		System.out.println(did);
		System.out.println(dname);
		System.out.println(c.getCname());
	}
}
