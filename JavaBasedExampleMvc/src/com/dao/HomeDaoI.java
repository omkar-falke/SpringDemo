package com.dao;

import java.util.List;

import com.model.Student;

public interface HomeDaoI {

	public int registerData(Student s);
	public List<Student> showData(Student s);
	public void deleteData(int id);
	public void updateEdit(Student s);
	public Student showData(int id);

}
