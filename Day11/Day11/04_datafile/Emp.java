package com.sunbeaminfo.dbda;

public class Emp implements Comparable<Emp> {
	private int empno;
	private String name;
	private double sal;
	private String city;
	public Emp() {
		this(0, "", 0.0, "");
	}
	public Emp(int empno, String name, double sal, String city) {
		this.empno = empno;
		this.name = name;
		this.sal = sal;
		this.city = city;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return String.format("Emp [empno=%s, name=%s, sal=%s, city=%s]", empno, name, sal, city);
	}
	@Override
	public int compareTo(Emp other) {
		int diff = this.empno - other.empno;
		return (int)Math.signum(diff);
	}
}




