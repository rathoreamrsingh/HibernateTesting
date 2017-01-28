package com.hibernate.testing.Hibernate_Testing;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.book.self.Hibernate_Testing.Book;

public class BookTest {
	private static SessionFactory factory;

	public static void main(String[] args) {

		try {
			Configuration configuration = new Configuration();
			//configuration.addAnnotatedClass(com.hibernate.testing.Hibernate_Testing.App.class);
			factory = configuration.configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		BookTest BT = new BookTest();

		/* Add few employee records in database */
		Integer bookID1 = BT.addbook("physics ", "2010");
		Integer bookID2 = BT.addbook("chemestry ", "2011");
		//BT.listBook();

	}

	

	private Integer addbook(String b_name, String p_date) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer bookID1 = null;
		try {
			tx = session.beginTransaction();
			Book bd = new Book(b_name, p_date );
			bookID1 = (Integer) session.save(bd);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return bookID1;
		
		// TODO Auto-generated method stub
	
	}

}
