package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTHOR")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="AID")
	private Integer aId;
	@Column(name="ANAME")
	private String name;
	@Column(name="ADDR")
	private String address;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Author [aId=" + aId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
