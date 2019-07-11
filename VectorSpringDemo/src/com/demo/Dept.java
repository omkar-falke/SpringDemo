package com.demo;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Dept {

	private Vector fruit;
	private TreeSet cricket;
	private Hashtable hs;

	
	public void setFruit(Vector fruit) {
		this.fruit = fruit;
	}


	public void setCricket(TreeSet cricket) {
		this.cricket = cricket;
	}


	public void setHs(Hashtable hs) {
		this.hs = hs;
	}


	public void showData() {
		for (Object fruits : fruit) {
			System.out.println(fruits);
		}
		System.out.println("----------cricketer --------------------");

		for (Object cr : cricket) {
			System.out.println(cr);
		}
		System.out.println("---------Country -------------");
		Set key = hs.keySet();

		for (Object c : key) {
			System.out.println(hs.get(c));
		}

	}

}
