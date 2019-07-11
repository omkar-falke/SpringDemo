package com.cjc;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class HomeController {
	Student stu;
	@RequestMapping("/log")
	public String logincheck(@RequestParam("username") String username,@RequestParam("password")String password,Model m)
	{	
		/*System.out.println(username);
		System.out.println(password);*/
		m.addAttribute("msg", stu);
		return "success";	
	}
	@RequestMapping("/reg")
	
	public String m1(@ModelAttribute ("stu") Student s)
	{
		stu=s;
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getMobile());
		return "index";
		
	}
	
	@RequestMapping("/register")
	public String m2()
	{
		return "register";
		
	}
	
	@RequestMapping("/dele")
	
	public String checkdelete()
	{
		System.out.println("...................");
		return "";
	}
}


