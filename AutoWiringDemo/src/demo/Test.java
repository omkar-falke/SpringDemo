package demo;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Student s=(Student)ac.getBean("addr");
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getAdd().getCityname());
	}
}
