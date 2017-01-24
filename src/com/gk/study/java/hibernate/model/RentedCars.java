package com.gk.study.java.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="rentedcars")
public class RentedCars {

	@Id 
	@GeneratedValue
	private int rcarid;
	private String carname;
	
	@ManyToMany(mappedBy="rentedcars")
	private Collection<Employee> employees = new ArrayList<Employee>();	
	
	
	public Collection<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}
	public int getRcarid() {
		return rcarid;
	}
	public void setRcarid(int rcarid) {
		this.rcarid = rcarid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	
	
}
