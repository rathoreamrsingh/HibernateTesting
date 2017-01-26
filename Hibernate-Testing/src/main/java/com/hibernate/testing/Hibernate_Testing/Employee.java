package com.hibernate.testing.Hibernate_Testing;

public class Employee {
	private int id;
	   private String fname; 
	   private String lname;
	   private String address;
	   private String phoneno;
	public int getId() {
		return id;
	}
	
	public Employee(int id, String fname, String lname, String address, String phoneno) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phoneno = phoneno;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	   
}
