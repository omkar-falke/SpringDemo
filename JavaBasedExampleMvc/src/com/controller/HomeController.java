package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.model.Student;
import com.service.HomeServiceI;

@Controller
public class HomeController {

	@Autowired
	HomeServiceI hs;
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/reg")
	public String checkregister(@ModelAttribute Student s) {
		int i = hs.registerData(s);
		if (i > 0) {
			return "index";
		} else {
			return "register";
		}
	}
	@RequestMapping("/log")
	public String checkShowData(@RequestParam("username")String username,@RequestParam("password")String password,@ModelAttribute Student s,Model m)
	{
		if (username.equals("admin") && password.equals("admin")) {
			List<Student> list = hs.showData(s);
			for (Student s1 : list) {
				m.addAttribute("msg", list);
				return "success";
			}
		}
		else
		{
			return null;
		}
		
		return null;
		
	}
	
	
	@RequestMapping("/del")
	
	public String mydelete(HttpServletRequest req,@ModelAttribute Student s,Model m)
	{
		int id=Integer.parseInt(req.getParameter("rid"));
		hs.deleteData(id);
		List<Student> list = hs.showData(s);
		m.addAttribute("msg", list);
		return "success";
		
	}
	
	@RequestMapping("/upd")
	public String checkupdate(@ModelAttribute Student s,
		HttpServletRequest req, Model m) {
		int id = Integer.parseInt(req.getParameter("rid"));
		Student e2 = (Student) hs.showData(id);
		m.addAttribute("msg", e2);
		return "Edit";
	}
	@RequestMapping("/Edit")
	public String edit() {
		return "Edit";
	}
	@RequestMapping("/up")
	public String updateEdit(@ModelAttribute Student s,Model m)
	{
		hs.updateEdit(s);
		List<Student> list = hs.showData(s);
		m.addAttribute("msg", list);
		return "success";
	}
	
	
	
}
