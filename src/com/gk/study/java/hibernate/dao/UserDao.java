/**
 * 
 */
package com.gk.study.java.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.model.User;
import com.gk.study.java.hibernate.util.HibernateUtil;

/**
 * @author gopi
 *
 */

public class UserDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {

		Session session = sessionFactory.openSession();
		List<User> userList = new ArrayList<User>();
		Query query;

		try {
			session.beginTransaction();
			query = session.createQuery("from User");
			userList = (List<User>) query.list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return userList;

	}

	public void addUser(User user) {

		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			System.out.println("Hibernate Session Close");
		}
	}

}
