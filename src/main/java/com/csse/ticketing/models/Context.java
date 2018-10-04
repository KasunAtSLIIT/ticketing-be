package com.csse.ticketing.models;

import com.csse.ticketing.interfaces.ICalculateFare;

public class Context {
	
	private ICalculateFare calFare;
	
	public Context(ICalculateFare calFare) {
		
		this.calFare=calFare;
	}
	
	public double executeStatergy(JourneyModel journey){
		return calFare.calculateFare(journey);
	}

}
