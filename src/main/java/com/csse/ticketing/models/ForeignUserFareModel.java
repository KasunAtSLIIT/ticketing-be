package com.csse.ticketing.models;

import com.csse.ticketing.interfaces.ICalculateFare;

public class ForeignUserFareModel implements ICalculateFare {

	@Override
	public double calculateFare(JourneyModel journey) {
		
		final double COST_PER_UNIT = 5.00; 
		double fare = 0.0;
		
		fare=20.00+(journey.getDistance()-1)*COST_PER_UNIT ;
		
		return fare;
	}
	

}
