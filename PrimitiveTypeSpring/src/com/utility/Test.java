package com.utility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		Student s=(Student)ac.getBean("stu");
//		Student s1=(Student)ac.getBean("stu");
	/*	
		System.out.println(s.getsId());
		System.out.println(s.getsName());
		System.out.println(s.getAddress());*/
		
		
	}
}
