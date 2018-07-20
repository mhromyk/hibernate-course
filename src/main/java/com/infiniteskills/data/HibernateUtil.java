package com.infiniteskills.data;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.infiniteskills.data.entities.User;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	
	private static SessionFactory buildSessionFactory() {
		try{
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(User.class);
			configuration.configure();
			return configuration.buildSessionFactory();
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("There were an errors building the session factory");
		}
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
