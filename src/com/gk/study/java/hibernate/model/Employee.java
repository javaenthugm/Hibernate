package com.gk.study.java.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue
	private int empid;
	private String empname;
	
	@ManyToMany
	@JoinTable(name="emp_cars", joinColumns=@JoinColumn(name="empid"),
		inverseJoinColumns=@JoinColumn(name="rcarid"))
	private Collection<RentedCars> rentedcars = new ArrayList<RentedCars>();
	
	
	
	public Collection<RentedCars> getRentedcars() {
		return rentedcars;
	}
	public void setRentedcars(Collection<RentedCars> rentedcars) {
		this.rentedcars = rentedcars;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	
}
