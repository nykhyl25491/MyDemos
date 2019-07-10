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
			
			Address address = new Address("Cybercity", "Pune","MH");
			Employee employee = new Employee("Nikhil", 5000, address);
			session.save(employee);
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
