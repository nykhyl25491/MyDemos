package com.app.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BI_EMPLOYEE")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EID")
	private Integer id;
	
	@Column(name="ENAME")
	private String name;
	
	@Column(name="ESALARY",columnDefinition="double(7,2)")
	private double salary;
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	List<Project> projects;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", projects=" + projects + "]";
	}

	
	
	

}
