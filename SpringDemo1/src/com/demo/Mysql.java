package com.demo;

public class Mysql  implements I{

	@Override
	public void commit() {
		System.out.println(" commit running...Mysql");
		
	}

	@Override
	public void rollback() {
		System.out.println(" rollback runnig..Mysql.");
		
	}

}
