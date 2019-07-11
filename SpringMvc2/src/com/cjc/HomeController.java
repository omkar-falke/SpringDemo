package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
@RequestMapping("/hell")
public String m1()
{
	System.out.println("h111");
	return "view";
}

@RequestMapping("/login")

public String m2()
{
	return "success";
}
	
}
