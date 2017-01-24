package com.gk.study.java.hibernate.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="CrudUser.byId",query="from CrudUser where userid=?")
@NamedNativeQuery(name="CrudUser.byName", query="select * from CrudUser where name=?",resultClass=CrudUser.class)
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class CrudUser {

	@Id @GeneratedValue
	private int userid;
	private String name;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
