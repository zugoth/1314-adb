/**
 * klasa narzedziowa dajaca dostep do sesji hibernate
 */
package com.rhcloud.zugospoint.util;

/**
 * @author zugo
 *
 */

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private SessionFactory sf;
	private static HibernateUtil hibUtil = new HibernateUtil();

	private HibernateUtil()
	{
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			Configuration cfg = new Configuration().configure();
			cfg.setProperty("hibernate.connection.url", LoginCredentials.getUrl());
			cfg.setProperty("hibernate.connection.username", LoginCredentials.getUsername());
			cfg.setProperty("hibernate.connection.password", LoginCredentials.getPassword());

			//don't know why in this sily way it works but it do
			@SuppressWarnings("deprecation")
			SessionFactory s = cfg.buildSessionFactory();
			sf = s;
		}
		catch (Throwable ex) {
			sf = null;
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return hibUtil.sf;
	}

	public static void shutdown(){
		getSessionFactory().close();
	}

}
