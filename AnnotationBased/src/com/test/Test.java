package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		
	ApplicationContext ap=new AnnotationConfigApplicationContext(Config.class);
		Stud s=(Stud)ap.getBean("s");
		
		s.setName("omkar");
		System.out.println(s.getName());
	}
}
