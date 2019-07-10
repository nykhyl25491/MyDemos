package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROJECT")
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PID")
	private Integer pId;
	
	@Column(name="PNAME")
	private String name;
	
	@Column(name="PDESC")
	private String desc;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name, String desc) {
		super();
		
		this.name = name;
		this.desc = desc;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", name=" + name + ", desc=" + desc + "]";
	}
	
	
}
