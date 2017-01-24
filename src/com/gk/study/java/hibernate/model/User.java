package com.gk.study.java.hibernate.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;




@Entity
@Table (name="user_details")
public class User {
	@Id
	@GeneratedValue
	private int userid;
	private String firstname;
	private String lastname;
	private String nickname;
	private Date dob;
	private Date crtdt;
	
	private int isactive;
	@Embedded
	private Address address;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="user_address",
		joinColumns=@JoinColumn(name="userid")
	)
	private Set<Address> listAddress = new HashSet<Address>();
	
	
	public Set<Address> getListAddress() {
		return listAddress;
	}
	public void setListAddress(Set<Address> listAddress) {
		this.listAddress = listAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getCrtdt() {
		return crtdt;
	}
	public void setCrtdt(Date crtdt) {
		this.crtdt = crtdt;
	}
	public int getIsactive() {
		return isactive;
	}
	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}
	
	

}
