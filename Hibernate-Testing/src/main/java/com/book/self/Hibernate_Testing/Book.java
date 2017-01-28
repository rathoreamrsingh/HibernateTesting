package com.book.self.Hibernate_Testing;
import java.io.Serializable;
/**
 * 
 * @author krishna
 *
 */
public class Book implements Serializable {
	public	int b_id;
	protected	String b_name;
	protected	String p_date;
	public Book( String b_name, String p_date ) {
		super();
		
		this.b_name = b_name;
		this.p_date = p_date;
	}
	public Book() {
		super();
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getP_date() {
		return p_date;
	}
	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	

}
