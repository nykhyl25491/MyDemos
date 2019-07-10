package com.app.service;

import com.app.pojo.Employee;

public interface EmployeeService {
	public Employee getEmployeeInfo(Integer id);
	public void saveEmployee(Employee employee);
}
