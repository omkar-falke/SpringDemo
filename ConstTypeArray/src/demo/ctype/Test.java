package demo.ctype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		College c=(College)ac.getBean("con");
		c.showData();
	}
}
