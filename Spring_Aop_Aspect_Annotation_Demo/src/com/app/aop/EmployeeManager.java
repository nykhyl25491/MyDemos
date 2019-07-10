package com.app.aop;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface EmployeeManager 
{
	public Employee getEmployeeById(Integer eId);
	
	public void createEmployee(Employee obj);
	
	public List<Employee> getAllEmployee();
	
	public void deleteEmployee(Integer eId);
	
	public void updateEmployee(Employee obj); 	
}
