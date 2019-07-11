package com.cjc.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.HomeDao;
import com.cjc.model.Employee;
import com.cjc.service.HomeService;
@Service
public class HomeServiceImp  implements HomeService{
@Autowired
	HomeDao hd;
	@Override
	public int registerData(Employee e) {
		// TODO Auto-generated method stub
		return  hd.registerData(e);
	}
	@Override
	public List<Employee> showData() {
		return (List<Employee>)hd.showData();
		// TODO Auto-generated method stub
	}
	
	@Override
	public Employee showData(int id) {
		// TODO Auto-generated method stub
		return hd.showData(id);
	}
	@Override
	public void updateEdit(Employee e) {
		hd.updateEdit(e);
	}
	@Override
	public List<Employee> checkLogin(String username, String password) {
		return hd.checkLogin(username, password);
	}
	@Override
	public void deleteData(int[] value) {
		System.out.println("Home Service ------------------"+value);
		for(int i:value)
		{
			System.out.println("home ser 1 "+ i);
		}
		hd.deleteData(value);
		
	}

}
