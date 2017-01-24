package com.gk.study.java.hibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class InteritanceApp {
	
	public static void main(String args[]){


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			session.getTransaction().begin();
			
			BaseVehicle bv = new BaseVehicle();
			bv.setName("Car");
			
			TwoWheeler tw = new TwoWheeler();
			tw.setName("Bike");
			tw.setSteeringHandle("TwoWheeler-SteeringHandle");
			
			FourWheeler fw = new FourWheeler();
			fw.setName("Porshse");
			fw.setSteeringWheel("FourWheeler-SteeringWheel");
			
			session.save(bv);
			session.save(tw);
			session.save(fw);
			

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
