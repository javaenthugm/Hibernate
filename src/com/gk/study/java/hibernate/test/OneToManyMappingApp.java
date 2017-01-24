package com.gk.study.java.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.model.UserDetails;
import com.gk.study.java.hibernate.model.Vehicle;
import com.gk.study.java.hibernate.util.HibernateUtil;

public class OneToManyMappingApp {

	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			session.getTransaction().begin();
			
			UserDetails user = new UserDetails();
			user.setName("Gopi");
					
			Vehicle v1= new Vehicle();
			v1.setName("BMW");		
			
			Vehicle v2= new Vehicle();
			v2.setName("Toyota");
		
			v1.setUserDetails(user);
			v2.setUserDetails(user);
			
			user.getVehicle().add(v1);
			user.getVehicle().add(v2);
			
			session.save(user);
			session.save(v1);
			session.save(v2);
			
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
