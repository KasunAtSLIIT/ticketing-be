package com.csse.ticketing.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csse.ticketing.exceptions.DataNotFoundException;
import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.models.RouteModel;
import com.csse.ticketing.repository.HaltRepository;
import com.csse.ticketing.repository.RouteRepository;
import com.csse.ticketing.models.JourneyModel;
import com.csse.ticketing.repository.JourneyRepository;
import com.csse.ticketing.services.JourneyService;

/**
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
	 * save single halt
	 */
	@Override
	public HaltModel createHalt(HaltModel halt){
		return haltRepo.save(halt);
	}
	
	/**
	 * update a single halt
	 */
	@Override
	public HaltModel updateHalt(HaltModel halt){
		 final HaltModel existHalt = haltRepo.findHaltModelByHaltNo(halt.getHaltNo());
	        if (existHalt == null) {
	            throw new DataNotFoundException("The requested halt is not found");
	        }
	      existHalt.setName(existHalt.getName());
	      existHalt.setNextHalt(existHalt.getNextHalt());
	      existHalt.setPreviousHalt(existHalt.getPreviousHalt());
	      existHalt.setRoutNo(existHalt.getRoutNo());
	      
	      return haltRepo.save(halt);
	}
	
	/**
	 * delete a single halt
	 */
	public void deleteHalt(String haltNo){
		  final HaltModel halt = haltRepo.findHaltModelByHaltNo(haltNo);
	        if (halt == null) {
	            throw new DataNotFoundException("The requested halt is not found");
	        }

	        haltRepo.save(halt);
	}
	
	/**
	 * get a single halt
	 */
	public HaltModel getHalt(String haltNo){
		 final HaltModel halt = haltRepo.findHaltModelByHaltNo(haltNo);
	        if (halt == null) {
	            throw new DataNotFoundException("The requested halt is not found");
	        }

	        return halt;
	}
	
	/**
	 * save a single route
	 */
	@Override
	public RouteModel createRoute(RouteModel rout){
		return routeRepo.save(rout);
	}
	
	/**
	 * update route
	 */
	@Override
	public RouteModel updateRoute(RouteModel route){
		 final RouteModel existRoute = routeRepo.findRouteModelByRouteNo(route.getRouteNo());
	        if (existRoute == null) {
	            throw new DataNotFoundException("The requested note is not found");
	        }
	      existRoute.setDistance(route.getDistance());
	      existRoute.setEndPoint(route.getEndPoint());
	      existRoute.setFare(route.getFare());
	      existRoute.setName(route.getName());
	      existRoute.setRouteNo(route.getRouteNo());
	      existRoute.setStartPoint(route.getEndPoint());
	      
	      return routeRepo.save(route);
	}
	
	/**
	 * get route by route no
	 */
	@Override
	public RouteModel getRoute(String routeNo){
	   final RouteModel route =  routeRepo.findRouteModelByRouteNo(routeNo);
	   if(route==null){
		   throw new DataNotFoundException("Route not for provided number");
	   }
	   
	   return route;
	}
	
	/**
	 * delete a single route
	 */
	@Override
	public void deleteRoute(final String routeId){
		 final RouteModel routes = routeRepo.findRouteModelByRouteNo(routeId);
	        if (routes == null) {
	            throw new DataNotFoundException("Route cant defined");
	        }
	       
	       routeRepo.deleteById(routeId);
	}

	
	/**
	 * @author Charuni
	 */
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
	public List<JourneyModel> listJourney() {
		// TODO Auto-generated method stub
		return journeyRepo.findAll();
	}
	

}
