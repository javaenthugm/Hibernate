package com.gk.study.java.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App01_CrudOperations {
	
	public static void main(String args[]){

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			session.getTransaction().begin();
			
			//CREATE
			CrudUser cu = null;
			for(int i=1;i<11;i++){
				cu = new CrudUser();
				cu.setName("User "+i);
				session.save(cu);
			}
			
			//READ
			cu = (CrudUser)session.get(CrudUser.class,5);
			System.out.println("User pulled up is " + cu.getName());
			
			
			//UPDATE
			cu.setName("Updated User Name");			
			session.update(cu);
			
			//DELETE
			//session.delete(cu);
			//System.out.println("User deleted " + cu.getName());
			
			
			
			
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			session.close();
			sessionFactory.close();
			System.out.println("Hibernate Session Close");
		}
	
	}

}
