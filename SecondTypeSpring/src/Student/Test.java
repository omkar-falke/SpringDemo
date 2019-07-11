package Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Stud s=(Stud)ac.getBean("st");
		s.showData();
	}
}
