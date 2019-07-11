package com.demo;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Deparment {

	private List fruit;
	private Set cricketer;
	private Map cc;
	public void setFruit(List fruit) {
		this.fruit = fruit;
	}
	public void setCricketer(Set cricketer) {
		this.cricketer = cricketer;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	public void showData()
	{
		
		System.out.println("---------------fruits -----------------");
			for(Object fruits:fruit)
			{
				System.out.println(fruits);
			}
			System.out.println("----------cricketer --------------------");
			
			for(Object cr:cricketer)
			{
				System.out.println(cr);
			}
			System.out.println("---------Country -------------");
			Set key=cc.keySet();
			
			for(Object c:key)
			{
			System.out.println(cc.get(c));
			}
			System.out.println("******************************************");
	}

}