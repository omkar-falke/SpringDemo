package com;

public class Car {

	
	public Car() {
		System.out.println(" car Calling");
	}
	
	
	private String name;
	private Engine engine;
	
	
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
