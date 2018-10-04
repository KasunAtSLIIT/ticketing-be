package com.csse.ticketing.services;

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

	

}
