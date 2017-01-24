package com.gk.study.java.hibernate.crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.gk.study.java.hibernate.util.HibernateUtil;

public class App07_CriteriaAPI {
	
	public static void main(String args[]){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		
		//Query query = session.createQuery("from CrudUser"); // HQL
		
		//Query query = session.getNamedQuery("CrudUser.byId"); //NamedQuery (HQL)
		//query.setInteger(0, 5);
		
		//Query query = session.getNamedQuery("CrudUser.byName"); //NamedQuery (SQL)
		//query.setString(0, "User 4");
		
		//Using Criteria
		/*Criteria criteria = session.createCriteria(CrudUser.class)
				.add(Restrictions.like("name", "User",MatchMode.START))
				.add(Restrictions.gt("userid", 5))
				.setProjection(Projections.property("userid"))
				.addOrder(Order.desc("userid"));*/
		
		//List<Integer> list = (List<Integer>)criteria.list();
		
		//Query by Example
		CrudUser example = new CrudUser();
		//example.setUserid(4);
		example.setName("User");
		
		Example eg = Example.create(example);
		Criteria criteria = session.createCriteria(CrudUser.class)
						 .add(eg);
		
		
		List<CrudUser> list = (List<CrudUser>)criteria.list();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Size :"+list.size());
		for(CrudUser c: list){
			System.out.println(c.getName());
		}
		/*for(Integer c: list){
			System.out.println(c);
		}*/
		
		sessionFactory.close();
	}

}
