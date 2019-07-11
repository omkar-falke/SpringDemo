package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="s")
	
	public Stud m1()
	{
		return new Stud();
		
	}
}
