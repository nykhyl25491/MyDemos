package com.app.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.pojo.Address;
import com.app.pojo.Employee;
import  com.app.utils.HibUtil;


public class Tester {
	public static void main(String[] args) {
		
		SessionFactory sf = HibUtil.getSf();
		Session session = null;
		Transaction tx =null;

		try {
			session = sf.getCurrentSession();
			tx = session.beginTransaction();
			/*
			 * Employee employee = new Employee("Shashank",50000.00); Address address = new
			 * Address("MegaPolis","Pune","MH"); address.setEmployee(employee);
			 * session.save(address);
			 */
			/*
			 * Employee employee= session.get(Employee.class, 3);
			 * System.out.println("Details :: "+employee);
			 */
			
			Address address = session.get(Address.class,2);
			System.out.println("Employee Details :: "+address.getEmployee());
			System.out.println("Details ::"+address);
			tx.commit();
		} 
		catch (Exception e) {
			if(tx!=null)
			{
				tx.rollback();
			}
		}
		finally {
			session.close();
		}
		
	}

}
