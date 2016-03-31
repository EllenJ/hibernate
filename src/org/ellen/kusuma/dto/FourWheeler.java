package org.ellen.kusuma.dto;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {
	private String Steeringwheels;

	public String getSteeringwheels() {
		return Steeringwheels;
	}

	public void setSteeringwheels(String steeringwheels) {
		Steeringwheels = steeringwheels;
	}
	

}
