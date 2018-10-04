package com.csse.ticketing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.models.RouteModel;
import com.csse.ticketing.repository.HaltRepository;
import com.csse.ticketing.repository.RouteRepository;
import com.csse.ticketing.services.JourneyService;

/**
 * 
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
}
