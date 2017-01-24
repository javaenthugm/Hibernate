package com.gk.study.java.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static /*final*/ SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            //return new Configuration().configure().buildSessionFactory(new StandardServiceRegistryBuilder().build() );
        	
        	Configuration configuration = new Configuration();
            configuration.configure();
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            return configuration.buildSessionFactory(serviceRegistry);  
            
        }catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
