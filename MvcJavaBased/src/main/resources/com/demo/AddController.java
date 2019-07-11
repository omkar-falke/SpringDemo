package com.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddController {
	
	@RequestMapping("/num")
	public String add(@RequestMapping("t1")int num1,@RequestMapping("t2")int num2)
	{
		ModelAndView mv=new ModelAndView();
		
		int k=num1+num2;
		mv.addAllObjects("result"+k);
		mv.setViewName("result.jsp");
		
		return mv;
		
	}

}
