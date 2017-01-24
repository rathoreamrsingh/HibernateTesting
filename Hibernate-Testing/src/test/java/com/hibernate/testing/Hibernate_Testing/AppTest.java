package com.hibernate.testing.Hibernate_Testing;import java.util.List; 
import java.util.Date;
import java.util.Iterator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends App
{
    
	private static SessionFactory factory; 
	   public static void main(String[] args){
		   
		   try{
		         factory = new Configuration().configure().buildSessionFactory();
		      }catch (Throwable ex) { 
		         System.err.println("Failed to create sessionFactory object." + ex);
		         throw new ExceptionInInitializerError(ex); 
		      }
		      AppTest AT = new AppTest();

		      /* Add few employee records in database */
		      Integer empID1= AT.addEmployee("Zara", "Ali", "bihar","jjigg");
		     // Integer empID1 = AT.addemployee("Zara", "Ali", "bihar","jjigg");
		    //  Integer empID2 = AT.addEmployee("Daisy", "Das", 5000);
		    //  Integer empID3 = ME.addEmployee("John", "Paul", 10000);

		      /* List down all the employees */
		      AT.listEmployees();

	   }
    /**
     * Rigourous Test :-)
     */
	private Integer addEmployee(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         App employee = new App(fname, lname, address, phoneno);
	         employeeID = (Integer) session.save(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;

		
	}
	/* Method to  READ all the employees */
	   public void listEmployees( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Employee").list(); 
	         for (Iterator iterator = 
	                           employees.iterator(); iterator.hasNext();){
	            App employee = (App) iterator.next(); 
	            System.out.print("First Name: " + employee.getFname()); 
	            System.out.print("  Last Name: " + employee.getLname()); 
	            System.out.println("  Address: " + employee.getAddress()); 
	            System.out.println("  Address: " + employee.getAddress()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }

}
