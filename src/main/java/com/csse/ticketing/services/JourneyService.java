package com.csse.ticketing.services;

import java.util.List;

import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.models.JourneyModel;
import com.csse.ticketing.models.RouteModel;

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
	public List<JourneyModel> listJourney();

	/**
	 * route interface
	 * @param rout
	 * @return
	 */
	
	public RouteModel createRoute(RouteModel rout);
	
	/**
	 * update route
	 * @param route
	 * @return
	 */
	
	public RouteModel updateRoute(RouteModel route);
	
	/**
	 * delete a route
	 * @param routeId
	 */
	
	public void deleteRoute(final String routeId);
	
	/**
	 * get a single route
	 * @param route
	 * @return
	 */
	public RouteModel getRoute(final String routeNo);
	
	/**
	 * halt interface
	 * @param halt
	 * @return
	 */
	public HaltModel createHalt(HaltModel halt);
	
	/**
	 * update a halt
	 * @param halt
	 * @return
	 */
	public HaltModel updateHalt(HaltModel halt);
	
	/**
	 * delete a halt
	 * @param haltNo
	 */
	public void deleteHalt(final String haltNo);
	
	/**
	 * get a single halt
	 * @param haltNo
	 * @return
	 */
	public HaltModel getHalt(final String haltNo);

	


}
