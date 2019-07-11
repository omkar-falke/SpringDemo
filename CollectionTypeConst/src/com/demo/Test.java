package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Prof p=(Prof)ac.getBean("li");
		p.showData();
	}
}
