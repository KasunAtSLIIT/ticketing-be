package com.csse.ticketing.models;

import com.csse.ticketing.interfaces.ICalculateFare;

public class ChildUserFareModel implements ICalculateFare{
	
	@Override
	public double calculateFare(JourneyModel journey) {
		
		final double COST_PER_UNIT = 3.00; 
		double fare = 0.0;
		
		fare=9.00+((journey.getDistance()-1)*COST_PER_UNIT )/2;
		
		return fare;
	}

}
