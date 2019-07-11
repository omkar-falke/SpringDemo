package com.cjc.util;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.Student;

@Configuration
@ComponentScan("com")
@EnableWebMvc
public class AppConfig {
	
	@Bean
	
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
	}
	
	@Bean
	public DriverManagerDataSource drivermanager ()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/mvctest");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}
	
	@Bean
	public LocalSessionFactoryBean sf()
	{
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(drivermanager());
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		lsfb.setHibernateProperties(p);
		lsfb.setAnnotatedClasses(Student.class);
		return lsfb;
	}
}
