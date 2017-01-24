package com.gk.study.java.hibernate.crud;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App04_Hql {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		/*
		Query query = session.createQuery("from CrudUser");
		query.setFirstResult(0);
		query.setMaxResults(4);
		List<CrudUser> list = (List<CrudUser>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Size :"+list.size());
		for(CrudUser c: list){
			System.out.println(c.getName());
		}
		*/
		// Select just one value
		/*
		Query query = session.createQuery("select name from CrudUser");
		query.setFirstResult(0);
		query.setMaxResults(4);
		List<String> list = (List<String>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Size :"+list.size());
		for(String c: list){
			System.out.println(c);
		}
		*/
		Query query = session.createQuery("select userid,name from CrudUser");
		List<Collection<String>> list = (List<Collection<String>>)query.list();
		
		for(Collection<String> c : list){
			System.out.println(c.size());
		}
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Size :"+list.size());
		
		
		sessionFactory.close();
	}

}
