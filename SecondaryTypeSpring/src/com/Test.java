package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("car.xml");
		
		Car car=(Car) ac.getBean("c");
		
		System.out.println(car.getName());
		System.out.println(car.getEngine().getModel());
	}
}
