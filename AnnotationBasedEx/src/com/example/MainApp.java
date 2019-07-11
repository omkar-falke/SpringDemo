xpackage com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				HelloWorldConfig.class);
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("s");
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}