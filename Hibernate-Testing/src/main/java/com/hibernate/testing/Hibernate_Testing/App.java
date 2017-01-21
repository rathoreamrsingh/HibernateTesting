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
public class App implements Serializable 
{
	private Long id;
	 
	private String login;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public App(Long id, String login) {
		super();
		this.id = id;
		this.login = login;
	}

	public App() {
		super();
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
