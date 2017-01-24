package com.gk.study.java.hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App06_NamedQuery {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		
		//Query query = session.createQuery("from CrudUser"); // HQL
		
		//Query query = session.getNamedQuery("CrudUser.byId"); //NamedQuery (HQL)
		//query.setInteger(0, 5);
		
		Query query = session.getNamedQuery("CrudUser.byName"); //NamedQuery (SQL)
		query.setString(0, "User 4");
		
		List<CrudUser> list = (List<CrudUser>)query.list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Size :"+list.size());
		for(CrudUser c: list){
			System.out.println(c.getName());
		}
		
		sessionFactory.close();
	}

}
