package com.cjc.service;

import java.util.List;

import com.cjc.model.Employee;

public interface HomeService {
	
	public int registerData(Employee e);
	
	public List<Employee> showData();
	
	public  void deleteData(int[] value);
	
	public Employee showData(int id);
	
	public void updateEdit(Employee e);
	
	public List<Employee> checkLogin(String username,String password);
}
