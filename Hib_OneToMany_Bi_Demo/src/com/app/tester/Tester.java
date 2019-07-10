package com.app.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.pojo.Address;
import com.app.pojo.Employee;
import com.app.pojo.Project;
import  com.app.utils.HibUtil;


public class Tester {
	public static void main(String[] args) 
	{
		SessionFactory sf = HibUtil.getSf();
		Session session = null;
		Transaction tx = null;
		
		
		  try 
		  { 
//			  Employee employee = new Employee("Gaurav",50000.00); 
//			  Project project1 = new Project("TCI","Nhi mila"); 
//			  project1.setEmployee(employee);
//			  Project project2 = new Project("SLB","Milna naseeb me nhi"); 
//			  project2.setEmployee(employee);
//			  List<Project> pList = new ArrayList<Project>(); 
//			  pList.add(project1); 
//			  pList.add(project2);
//			  employee.setProjects(pList); 
			  session = sf.getCurrentSession();
			  tx = session.beginTransaction(); 
//			  Employee employee = session.get(Employee.class,8);
//			  System.out.println("Details :: "+employee);
			  
			  Project project = session.get(Project.class, 9);
			  System.out.println(project.getEmployee());
			  System.out.println("Project dtls :: "+project);
			  tx.commit();
		  } 
		  catch (Exception e) 
		  { if(tx!=null) 
			  tx.rollback(); 
		  } 
		  finally {
		  session.close(); }
		 
	}
}
