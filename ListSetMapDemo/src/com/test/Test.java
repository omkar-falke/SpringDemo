package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
public static void main(String[] args) {
	
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
	Dept d=(Dept)ac.getBean("dept");
}
}
