/**
 * 
 */
package com.rhcloud.zugospoint.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rhcloud.zugospoint.model.*;
import com.rhcloud.zugospoint.util.HibernateUtil;
/**
 * Klasa zawiera zbior niskopoziomowych metod dostepu do danych z bazy
 * @author zugo
 *
 */
public class ApplicationDAO {
	private SessionFactory sessionF;

	public ApplicationDAO (){
		
		sessionF = HibernateUtil.getSessionFactory();
	}
	
	public void addAdres(Adres theAdres) 
	{

		Session session = sessionF.getCurrentSession();
		try{
			session.beginTransaction();
			session.save(theAdres);
			session.getTransaction().commit();
			session.close();
		}catch (HibernateException e){
			session.getTransaction().rollback();
			e.printStackTrace(); 
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Adres> getAllAdreses(){
		Session s = sessionF.getCurrentSession();
		List<Adres> res = null;
		try{
			s.beginTransaction();
			res = s.createQuery("from Adres").list();
			s.getTransaction().commit();
			s.close();
		}catch (HibernateException e){
			s.getTransaction().rollback();
			e.printStackTrace();// TODO throw apropriate exception when catch it, or not, considere it
			s.close();
		}
		return res;
	}

}