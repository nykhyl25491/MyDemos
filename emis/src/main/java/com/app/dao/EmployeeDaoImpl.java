package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	private SessionFactory sf;
	
	@Override
	public Employee getEmployeeInfo(Integer id) 
	{
		System.out.println("call placed Inside dao ");
		Employee  e= sf.getCurrentSession().get(Employee.class, id);
		 System.out.println(e.getSkills());
		return  e;
				//sf.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		sf.getCurrentSession().save(employee);
		
	}
	
}
