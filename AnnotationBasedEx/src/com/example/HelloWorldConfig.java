package com.example;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
	@Bean(name="s")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}