package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojo.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDao dao;
	@Override
	public Employee getEmployeeInfo(Integer id) 
	{
		System.out.println("call placed Inside service ");
		return dao.getEmployeeInfo(id);
	}
	@Override
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
		
	}
}
