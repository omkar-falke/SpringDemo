package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Car c=(Car)ac.getBean("c");
		
		for(String c1:c.getCarname())
		{
			System.out.println(c1);
		}
		
		for(Engine c2:c.getEngine())
		{
			System.out.println(c2.getModelyear());
		}
		

	}
}
