package com.hibernate.testing.Hibernate_Testing;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Unit test for simple App.
 */
public class AppTest {

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
		AppTest AT = new AppTest();

		/* Add few employee records in database */
		Integer empID1 = AT.addEmployee("Amar ", "singhwewewe", "bihar", "jjigg");
		// AT.listEmployees();

	}

	/**
	 * Rigourous Test :-)
	 */
	private Integer addEmployee(String fname, String lname, String address, String phoneno) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			App employee = new App(fname, lname, address, phoneno);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeID;

	}

	/* Method to READ all the employees */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				App employee = (App) iterator.next();
				System.out.print("First Name: " + employee.getFname());
				System.out.print("  Last Name: " + employee.getLname());
				System.out.println("  Address: " + employee.getAddress());
				System.out.println("  Address: " + employee.getAddress());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
