package com.csse.ticketing.interfaces;

import com.csse.ticketing.models.JourneyModel;
import com.csse.ticketing.models.UserModel;

public interface ICalculateFare {
	
	public double calculateFare(JourneyModel journey);

}
