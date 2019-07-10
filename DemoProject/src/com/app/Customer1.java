package com.app;

public class Customer1  implements Cloneable
{
	private int id;
	private String name;
	private String city;
	
	public Customer1() {
		// TODO Auto-generated constructor stub
	}

	public Customer1(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Customer1 obj = new Customer1(); //Deep copy
		obj.id = this.id;
		obj.name = this.name;
		obj.city = this.city;
		return obj;
		//return super.clone(); //shallow copy
	}
	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer1 other = (Customer1) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
