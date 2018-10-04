package com.csse.ticketing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.models.RouteModel;
import com.csse.ticketing.repository.HaltRepository;
import com.csse.ticketing.repository.RouteRepository;
import java.util.List;
import com.csse.ticketing.models.JourneyModel;

import com.csse.ticketing.repository.JourneyRepository;

import com.csse.ticketing.services.JourneyService;

/**
 * 
<<<<<<< HEAD
 * @author Kasun
 *
 */
@Service
public class JourneyServiceImpl implements JourneyService{
   
	@Autowired
	private RouteRepository routeRepo;
	
	@Autowired
	private HaltRepository haltRepo;
	
	/**
	 * save a single route
	 */
	@Override
	public RouteModel createRoute(RouteModel rout){
		return routeRepo.save(rout);
	}
	
	/**
	 * save single halt
	 */
	@Override
	public HaltModel createHalt(HaltModel halt){
		return haltRepo.save(halt);
	}
	
	@Autowired 
	private JourneyRepository journeyRepo;

	@Override
	public JourneyModel createJourney(JourneyModel journey) {
		// TODO Auto-generated method stub
		return journeyRepo.save(journey);
	}

	@Override
	public JourneyModel updateJourney(JourneyModel journey) {
		// TODO Auto-generated method stub
		return journeyRepo.save(journey);
	}

	@Override
	public JourneyModel retriveJourney(String id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JourneyModel> listJourney(String user) {
		// TODO Auto-generated method stub
		return journeyRepo.findAll();
	}
	

}
