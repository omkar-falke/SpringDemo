package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	
	public static void main(String[] args) {
		
		/*Resource r=new ClassPathResource("beans.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(r);*/
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		I i=(I)ac.getBean("c");
		System.out.println(ac.getApplicationName());
		i.rollback();
		i.commit();	
		I i1=(I)ac.getBean("c");
		
		
	}
}
