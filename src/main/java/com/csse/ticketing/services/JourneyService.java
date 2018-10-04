package com.csse.ticketing.services;


import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.models.RouteModel;

/**
 * 
 * @author Kasun
 *
 */

import java.util.List;

import com.csse.ticketing.models.JourneyModel;

public interface JourneyService {
	
	/**
	 * @author Charuni
	 * @param journey
	 * @return
	 */
	public JourneyModel createJourney(JourneyModel journey);
	
	/**
	 * @author Charuni
	 * @param journey
	 * @return
	 */
	public JourneyModel updateJourney(JourneyModel journey);
	
	/**
	 * @author Charuni
	 * @param id
	 * @return
	 */
	public JourneyModel retriveJourney(final String id);
	
	/**
	 * @author Charuni
	 * @param user
	 * @return
	 */
	public List<JourneyModel> listJourney(final String user);

	

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
