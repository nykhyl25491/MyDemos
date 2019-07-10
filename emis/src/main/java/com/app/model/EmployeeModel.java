package com.app.model;

import java.util.ArrayList;
import java.util.List;



import com.app.pojo.Skills;

public class EmployeeModel 
{
	private Integer id;
	private String name;
	private int age;
	private String gender;
	private String info;
	private List<String> skills;
	
	public EmployeeModel() {
		this.skills = new ArrayList<String>()	;
		}

	public EmployeeModel(Integer id, String name, int age, String gender, String info) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.info = info;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", info=" + info
				+ "]";
	}
	
}
