package com.app.tester;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.pojo.Address;
import com.app.pojo.Employee;
import  com.app.utils.HibUtil;
class A
{
	
	public Object m1(String obj) throws Exception 
	{
		// TODO Auto-generated method stub
		return null;
	}
}

class B extends A
{
	@Override
	public String m1( String obj) throws IOException{
		// TODO Auto-generated method stub
	//	super.m1(obj);
		return null;
	}
}
public class Tester {
	
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibUtil.getSf();
		Session session = null;
		Transaction tx =null;

		try {
			session = sf.getCurrentSession();
			tx = session.beginTransaction();
			
			/*
			 * Address address = new Address("MegaPolis","Pune","MH"); Employee employee =
			 * new Employee("Shashank",50000.00); employee.setAddress(address);
			 * session.save(employee);
			 */
			Address address = session.get(Address.class,5);
			System.out.println("Details :: "+address);
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
