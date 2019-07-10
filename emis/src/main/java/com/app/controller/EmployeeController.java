package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.app.model.EmployeeModel;
import com.app.pojo.Employee;
import com.app.pojo.Skills;
import com.app.service.EmployeeService;

@RestController
public class EmployeeController{
	@Autowired
	private EmployeeService service;

	@GetMapping(value = "/get/{id}") 
	public ResponseEntity<EmployeeModel>getEmployee(@PathVariable int id) 
	{ 
		Employee emp = service.getEmployeeInfo(id); 
		System.out.println(emp.getSkills());
		EmployeeModel empModel = new EmployeeModel(); 
		empModel.setId(emp.getId());
		empModel.setName(emp.getName()); 
		empModel.setAge(emp.getAge());
		empModel.setGender(emp.getGender()); 
		empModel.setInfo(emp.getInfo()); 
		for(Skills skill : emp.getSkills()) 
		{
			empModel.getSkills().add(skill.getSkill()); 
		}
		System.out.println("---------"+emp); 
		return new ResponseEntity<EmployeeModel>(empModel, HttpStatus.OK); 
	}



	@PostMapping(value = "/save" , headers="Accept=application/json" ) 
	public ResponseEntity<HttpStatus> saveEmployee(@RequestBody Employee emp)
	{
		System.out.println("----"+emp);
		for (Skills skill : emp.getSkills()) 
			skill.setEmployee(emp);
		service.saveEmployee(emp);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED); 
	}
	
	
}
