package com.csse.ticketing.services;

import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.models.RouteModel;

/**
 * 
 * @author Kasun
 *
 */
public interface JourneyService {

	/**
	 * route interface
	 * @param rout
	 * @return
	 */
	RouteModel createRoute(RouteModel rout);
	
	/**
	 * halt interface
	 * @param halt
	 * @return
	 */
	HaltModel createHalt(HaltModel halt);
}
