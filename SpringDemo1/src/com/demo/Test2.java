package com.demo;

public class Test2 {
	public static void main(String[] args) {
		
		
		MyOracle o=new MyOracle();
		o.rollback();
		o.commit();
		
		Mysql  m=new Mysql();
		o.rollback();
		o.commit();
		
	}
}
