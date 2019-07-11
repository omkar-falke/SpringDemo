package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller2 {
	@RequestMapping("/hello")
	public String m1()
	{
		System.out.println("Hello");
		return "success";
}
}
