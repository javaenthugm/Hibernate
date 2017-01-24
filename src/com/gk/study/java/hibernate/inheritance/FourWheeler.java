package com.gk.study.java.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fourwheeler")
public class FourWheeler extends BaseVehicle{
	
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	
	
	

}
