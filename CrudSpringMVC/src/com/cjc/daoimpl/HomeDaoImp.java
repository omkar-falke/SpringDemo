package com.cjc.daoimpl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.HomeDao;
import com.cjc.model.Employee;

@Repository
public class HomeDaoImp implements HomeDao{
	@Autowired
	SessionFactory sf;
	@Override
	public int registerData(Employee e) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		int id=(int) session.save(e);
		transaction.commit();
		return id;
	}
	@Override
	public List<Employee> showData() {
		Session session=sf.openSession();
		Query<Employee> q=session.createQuery("from Employee");
		List<Employee> list=q.getResultList();
		return list;
	}
	
	@Override
	public void deleteData(int[] id) {
		
		System.out.println("in dao impl");
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		for(int i=0;i<id.length;i++)
		{
			Employee e=new Employee();
			System.out.println("in dao impl"+id[i]);
			int id1=id[i];
			e.setId(id1);
			session.delete(e);
			
		/*	Query q=session.createQuery("delete From Employee Where id=:nm").setParameter("nm",id[i]);
		q.executeUpdate();*/
		
		}
		transaction.commit();

		
		
	}
	
	@Override
	public Employee showData(int id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e2=session.get(Employee.class, id);
		return e2;
	}
	
	@Override
	public void updateEdit(Employee e) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(e);
		transaction.commit();
	}
	@Override
	public List<Employee> checkLogin(String username, String password) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Query q=(Query) session.createQuery("from Employee where username=:username and password=:password",Employee.class).setParameter("username", username).setParameter("password", password);	
		List<Employee>list=q.getResultList();
		return list;
	}

}
