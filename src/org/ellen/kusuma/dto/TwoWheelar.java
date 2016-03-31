package org.ellen.kusuma.dto;

import javax.persistence.Entity;

@Entity
public class TwoWheelar extends Vehicle {
	
	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}
	

}
