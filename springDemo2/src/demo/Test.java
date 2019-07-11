package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e=(Employee)ap.getBean("conn");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		
		
				
	}

}
