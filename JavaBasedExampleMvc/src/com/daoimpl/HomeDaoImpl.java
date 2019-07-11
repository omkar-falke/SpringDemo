package com.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.util.*;
import com.dao.HomeDaoI;
import com.model.Student;
@Repository
public class HomeDaoImpl  implements HomeDaoI{
	@Autowired
	SessionFactory sf;
	
	@Override
	public int registerData(Student s) {	
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		int id=(int)session.save(s);
		tr.commit();
		return id;
	}

	@Override
	public List<Student> showData(Student s) {
		
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query<Student> q=session.createQuery("from Student");
		List<Student>list=q.getResultList();
		return list;
	}

	@Override
	public void deleteData(int id) {
	
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query<Student>q=session.createQuery("delete from Student where id=:id").setParameter("id", id);
		q.executeUpdate();
		tr.commit();
	}

	@Override
	public void updateEdit(Student s) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(s);
		transaction.commit();
		
		
	}

	@Override
	public Student showData(int id) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Student s=session.get(Student.class, id);
		return s;
	}

}
