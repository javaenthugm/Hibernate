package com.gk.study.java.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App02_TransietPersistentDetached {
	public static void main(String args[]){


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			session.getTransaction().begin();
			
			//Transient
			CrudUser cu = new CrudUser();
			cu.setName("Transient");
			
			//Persistent
			session.save(cu);
			
			session.getTransaction().commit();
			

			//Detached
			String userName = cu.getName();			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			session.close();
			sessionFactory.close();
			System.out.println("Hibernate Session Close");
		}
	
	
	}

}
