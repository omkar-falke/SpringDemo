package com.cjc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class LoginController {

	
	
	@RequestMapping("/lo")
	public String m1(HttpServletRequest req, Model m) {

		String name = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		
		if(name.equals("admin") && password.equals("admin"))
		{
			String msg="Hello" +"  "+name;
			m.addAttribute("msg",msg);
		}
			return "success";
		
		
		
		

	}

}
