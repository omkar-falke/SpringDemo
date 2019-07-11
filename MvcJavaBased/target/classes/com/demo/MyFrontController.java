package com.demo;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyFrontController extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{MvcWebConfig.class}
	}
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}
	public MyFrontController() {
		// TODO Auto-generated constructor stub
		
		return new  String{"/"};
	}

}
