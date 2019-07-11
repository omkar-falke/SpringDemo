package Com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=(Student)ac.getBean("stu");
		
		System.out.println(s);
		System.out.println(s.getAddr());
		
		s=(Student)ac.getBean("stu");
		System.out.println(s);
		System.out.println(s.getAddr());
		
		
	}
}
