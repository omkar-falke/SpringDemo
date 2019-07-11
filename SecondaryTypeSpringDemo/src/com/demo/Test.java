package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e=(Employee)ac.getBean("s");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddr().getCity());
	}
}
