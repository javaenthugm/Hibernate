package com.gk.study.java.hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App05_ParameterBindingAndSqlInjection {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		int minUserid= 5;
		String userName ="User 10";
		// query Paramter
		/*Query query = session.createQuery("from CrudUser where userid > ? and name=?");
		query.setInteger(0, minUserid);
		query.setString(1, userName);*/
		
		// Named Parameter
		Query query = session.createQuery("from CrudUser where userid > :userId and name =:userName");
		query.setInteger("userId", minUserid);
		query.setString("userName", userName);
		

		List<CrudUser> list = (List<CrudUser>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		for(CrudUser c: list){
			System.out.println(c.getName());
		}
		
		sessionFactory.close();
	}

}
