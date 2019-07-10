package com.app.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class EmployeeManagerImpl implements EmployeeManager {

	@Override
	public Employee getEmployeeById(Integer eId)
	{
		System.out.println("Method getEmployeeById called");
		return new Employee();
	}

	@Override
	public void createEmployee(Employee obj)
	{
		System.out.println("Method createEmployee called");
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		System.out.println("Method getAllEmployee called");
		return new ArrayList<Employee>();
	}

	@Override
	public void deleteEmployee(Integer eId) 
	{
		System.out.println("Method deleteEmployee called");
	}

	@Override
	public void updateEmployee(Employee obj) 
	{
		System.out.println("Method updateEmployee called");
	}

}
