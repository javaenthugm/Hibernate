package com.gk.study.java.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="basevehicle")
@Inheritance(strategy=InheritanceType.JOINED)
public class BaseVehicle {
	/* 
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(name="type",
			discriminatorType=DiscriminatorType.STRING	
			)*/
	

	@Id @GeneratedValue
	private int vehicleid;

	private String name;

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
