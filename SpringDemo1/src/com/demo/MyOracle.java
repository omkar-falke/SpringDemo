package com.demo;

public class MyOracle  implements I{

	public MyOracle() {
		System.out.println(" MyOracle Calling const");
	}
	
	@Override
	public void commit() {
		System.out.println("commit of oracle running ..");
		
	}

	@Override
	public void rollback() {
		System.out.println(" rollback of myoracle running");
		
	}

}
