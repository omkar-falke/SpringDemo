package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
public class LoginControllerDemo {

	
/*	@RequestMapping(name="/dips")
public String logincheck(@RequestParam("username") String username,@RequestParam("password")String password,Model m)
{	
	System.out.println(username);
	System.out.println(password);
	m.addAttribute("msg", username);
	return "success";	
}*/
	
	@RequestMapping(value="/dips/{username}/{password}")
	public String logincheck(@PathVariable("username")String username,@PathVariable("password")String password)
	{
		System.out.println(username);
		System.out.println(password);
		return "success";
	}

	
}
