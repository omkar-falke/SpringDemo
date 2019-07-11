package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Emp e=(Emp)ac.getBean("emp");
		Emp e1=(Emp)ac.getBean("emp");
		
		System.out.println("Employee ID:"+" "+e.geteId());
		System.out.println("Employee Name:"+" "+e.geteName());
		
		for(String add:e.getAddress())
		{
			System.out.println("Address"+add);
		}
		
	
		
		for(long mobile:e.getMo())
		{
			System.out.println("mobile No"+" "+mobile);
		}
	}
}
