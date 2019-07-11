package com.cjc.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

import com.cjc.model.Employee;
import com.cjc.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;

	@RequestMapping("/login")
	public String checklogin(@RequestParam("username") String username,
			@RequestParam("password") String password, Model m) {

		if (username.equals("admin") && password.equals("admin")) {
			List<Employee> list = hs.showData();
			m.addAttribute("msg", list);
			return "success";
		} else {
			
			List< Employee>list=hs.checkLogin(username, password);
			
			if(!list.isEmpty())
			{
				m.addAttribute("msg", list);
				return "success";
			}
			return "index";
		}
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/reg")
	public String checkregister(@ModelAttribute Employee e) {
		int i = hs.registerData(e);
		if (i > 0) {
			return "index";
		} else {
			return "register";
		}
	}
	@RequestMapping("/dele")
	public String checkdelete(HttpServletRequest req, Model m) {
		int i;
		String id[]=req.getParameterValues("eid");
	
		for (int j = 0; j <=id.length-1; j++) {
			System.out.println("in home impl "+id[j]);
		}
		
		int []value=new int[id.length];
		for( i=0;i<value.length;i++)
		{
			value[i]=Integer.parseInt(id[i]);
			
			System.out.println("in service home-------------------------"+value[i]);
		
			hs.deleteData(value);
		List<Employee> list = hs.showData();
			m.addAttribute("msg", list);
		
			return "success";
			//return null;
			
		}
		//System.out.println(value[i]);
	/*	hs.deleteData(value);
		return "success";*/
		return null;
	
		
		
		
	
		//int id = Integer.parseInt(req.getParameter("eid"));
		/*hs.deleteData(id);
		List<Employee> list = hs.showData();
		m.addAttribute("msg", list);*/
		
	}
	@RequestMapping("/up")
	public String checkupdate(@ModelAttribute Employee e,
		HttpServletRequest req, Model m) {
		int id = Integer.parseInt(req.getParameter("eid"));
		Employee e2 = hs.showData(id);
		m.addAttribute("msg", e2);
		return "Edit";
	}
	@RequestMapping("/Edit")
	public String edit() {
		return "Edit";
	}
	@RequestMapping("/update")
	public String updateEdit(@ModelAttribute Employee e,Model m)
	{
		hs.updateEdit(e);
		List<Employee> list = hs.showData();
		m.addAttribute("msg", list);
		return "success";
	}
}
