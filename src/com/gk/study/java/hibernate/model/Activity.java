package com.gk.study.java.hibernate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="activities")
public class Activity {

	@Id @GeneratedValue
	private int activityid;
	
	private int catid;
	
	
	private int subcatid;
	private int userid;
	private Date crtdt;
	
	public int getActivityid() {
		return activityid;
	}
	public void setActivityid(int activityid) {
		this.activityid = activityid;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getCrtdt() {
		return crtdt;
	}
	public void setCrtdt(Date crtdt) {
		this.crtdt = crtdt;
	}
	
	
	
}
