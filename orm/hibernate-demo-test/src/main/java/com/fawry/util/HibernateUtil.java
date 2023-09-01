package com.fawry.util;

import com.fawry.entities.Test;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory factory;

	private HibernateUtil() {
	}

	public static synchronized SessionFactory getSessionFactory() {

		if (factory == null) {
			factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Test.class)
					.buildSessionFactory();
		}
		return factory;
	}
}