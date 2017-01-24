package com.gk.study.java.hibernate.model;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="user_address")
public class Address {
		
	//private int userid;
	
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	/*public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}*/
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

}
