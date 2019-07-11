package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HomeDaoI;
import com.model.Student;
import com.service.HomeServiceI;
@Service
public class HomeServiceImpl  implements HomeServiceI{
	@Autowired
	HomeDaoI hd;
	
	@Override
	public int registerData(Student s) {
		// TODO Auto-generated method stub
		return hd.registerData(s);
	}

	@Override
	public List<Student> showData(Student s) {
		
		return hd.showData(s);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		hd.deleteData(id);
		
	}

	@Override
	public void updateEdit(Student s) {
		// TODO Auto-generated method stub
		hd.updateEdit(s);
		
	}

	@Override
	public Student showData(int id) {
		// TODO Auto-generated method stub
		
		return hd.showData(id);
	}
	
	

}
