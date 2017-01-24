package com.gk.study.java.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.model.UserDetails;
import com.gk.study.java.hibernate.model.Vehicle;
import com.gk.study.java.hibernate.util.HibernateUtil;

public class OneToOneMappingApp {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			
			/*// One to One
			UserDetails user = new UserDetails();
			user.setName("Sindhu3");
			
			
			Vehicle vehicle = new Vehicle();
			vehicle.setName("Car");
			
			vehicle.setUserDetails(user);
			user.setVehicle(vehicle);
			
			
		
			//Save
			session.save(user);
			session.save(vehicle);
			
			
			//Find
			Query query = session.createQuery("from UserDetails");
			List<UserDetails> lud= (List<UserDetails>)query.list();
			
			for(UserDetails ud:lud){
				System.out.println(ud.getName());
			}
			//Update 
			user.setUserid(4);
			session.update(user);
			//Delete
			session.delete(user);
			
			session.getTransaction().commit();*/

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
			System.out.println("Hibernate Session Close");
		}
	}

}
