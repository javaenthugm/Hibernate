package com.gk.study.java.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gk.study.java.hibernate.model.Activity;
import com.gk.study.java.hibernate.util.HibernateUtil;

public class ActivitiesDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void addActivity(Activity act) {

		Session session = sessionFactory.openSession();
		try {

			session.beginTransaction();
			session.save(act);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public Activity getActivity(int activityId){
		Activity activity = null;
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			activity = (Activity)session.get(Activity.class, activityId);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return activity;
	}

}
