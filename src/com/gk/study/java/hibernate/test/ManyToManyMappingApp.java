package com.gk.study.java.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.model.Employee;
import com.gk.study.java.hibernate.model.RentedCars;
import com.gk.study.java.hibernate.util.HibernateUtil;

public class ManyToManyMappingApp {
	
	public static void main(String[] args){

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			session.getTransaction().begin();
			
			Employee emp1 = new Employee();
			emp1.setEmpname("Gopi");
			
			RentedCars car1 = new RentedCars();
			car1.setCarname("Honda Civic");
			RentedCars car2 = new RentedCars();
			car2.setCarname("Toyota Camry");
			
			emp1.getRentedcars().add(car1);
			emp1.getRentedcars().add(car2);
			
			car1.getEmployees().add(emp1);
			car2.getEmployees().add(emp1);
			
			session.save(emp1);
			session.save(car1);
			session.save(car2);
			
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
