package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_SKILL")
public class Skills {
	
	private Integer id;
	private String skill;
	private Employee employee;
	
	public Skills() {
		// TODO Auto-generated constructor stub
	}

	public Skills(String skill) {
		super();
		this.skill = skill;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="SKILL")
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@ManyToOne
	@JoinColumn(name="EID")
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", skill=" + skill + "]";
	}
	
	
}
