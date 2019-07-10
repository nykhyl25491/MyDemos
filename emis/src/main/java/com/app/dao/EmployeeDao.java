package com.app.dao;

import com.app.pojo.Employee;

public interface EmployeeDao {
	public Employee getEmployeeInfo(Integer id);
	public void saveEmployee(Employee employee);

}
