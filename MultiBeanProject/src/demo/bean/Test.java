package demo.bean;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Student s=(Student)ac.getBean("student");
		System.out.println(s.getsId());
		System.out.println(s.getsName());
		System.out.println(s.getsAddress());
		
	ApplicationContext ac1=new ClassPathXmlApplicationContext("springdemo.xml");
		
		Student s1=(Student)ac1.getBean("studentdemo");
		System.out.println(s.getsId());
		System.out.println(s.getsName());
		System.out.println(s.getsAddress());
		
	
	}

}
