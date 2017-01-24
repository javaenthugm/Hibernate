package com.gk.study.java.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="twowheeler")
public class TwoWheeler extends BaseVehicle{
	
	
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
	

}
