package com.cjc.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class IntilizerTest  implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext req) throws ServletException {
		
		AnnotationConfigWebApplicationContext apwac=new AnnotationConfigWebApplicationContext();
		apwac.register(AppConfig.class);
		apwac.setServletContext(req);
		
		ServletRegistration.Dynamic srr=req.addServlet("dispatcher", new DispatcherServlet(apwac));
		srr.addMapping("/");
	}
}
