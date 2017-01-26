package com.hibernate.testing.Hibernate_Testing;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Hello world!
 *
 */
public class App implements Serializable {
	private int id;
	protected String fname;
	protected String lname;
	protected String address;
	protected String phoneno;

	public int getId() {
		return id;
	}

	public App() {
	}

	public App(String fname, String lname, String address, String phoneno) {
		super();

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
