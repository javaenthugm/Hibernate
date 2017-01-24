package com.gk.study.java.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App03_PersistingDetachedObjects {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		try {
		
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();			
			//Persistent
			CrudUser user = (CrudUser)session.get(CrudUser.class,1);
			System.out.println(user.getName());
			session.getTransaction().commit();
			session.close(); // user became Detached 
			
			//Waiting for user's reponse - 
			//Remaining code may be in another method'
			Thread.sleep(1000);
			
			//user.setName("Updating a detached object");
			
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.update(user);
			//user.setName("Changing back...");
			session.getTransaction().commit();
			session.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
			System.out.println("Hibernate Session Close");
		}
	
	
	
	}

}
