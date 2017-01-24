package com.gk.study.java.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App08_Cache {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		CrudUser cu = (CrudUser)session.get(CrudUser.class, 1);
		cu.setName("User 1 - updated");
		
		
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		session2.getTransaction().begin();
		
		
		CrudUser cu2 = (CrudUser)session2.get(CrudUser.class, 1);
		
		session2.getTransaction().commit();
		session2.close();
		
		System.out.println(cu.getName());
		System.out.println(cu2.getName());
		
		sessionFactory.close();
	}

}
