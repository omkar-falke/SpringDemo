package com.daoimp;

import java.util.ArrayList;
import java.util.List;




import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.dao.Dao;
import com.model.Deparment;
import com.utility.HibernateUtil;

public class DaoImp  implements Dao{
	

	Session session=HibernateUtil.getSessionFactory().openSession();
	@Override
	public void addDeparment(Deparment d) {
		
		
		
		session.save(d);
		session.beginTransaction().commit();
		
	}

	@Override
	public List<Deparment> showData() {
		org.hibernate.query.Query<Deparment>q=session.createQuery("from Deparment",Deparment.class);
		List<Deparment> list=q.getResultList();
		return list;
	}

	@Override
	public void deleteData(int id) {
		
		Transaction t=session.beginTransaction();
	
		Query<Deparment> q=session.createQuery("delete from Deparment where id=:nm").setParameter("nm", id);
		//Query q=(Query) session.createQuery("delete from Deparment where id=:nm").setParameter("nm", id);
				//Query q=session.createQuery("delete From LoginAppPojo Where id=:nm").setParameter("nm", id);
		q.executeUpdate();
		t.commit();
	
		
		
				
				
	}

	


}
