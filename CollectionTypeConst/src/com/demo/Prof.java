package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Prof {

	private List myList;
	private Set mySet;
	private Map mymap;
	
	public Prof(List myList,Set mySet,Map myMap) {
		
		this.myList=myList;
		this.mySet=mySet;
		this.mymap=myMap;
	}
	
	public void showData()
	{
		for(Object list:myList)
		{
			System.out.println(list);
		}
		
		for(Object set:mySet)
		{
			System.out.println(set);
		}
		
		Set keys=mymap.keySet();
		
		for(Object k:keys)
		{
			System.out.println(mymap.get(k));
		}
	}
}
