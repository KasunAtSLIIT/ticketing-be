package com.csse.ticketing.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.csse.ticketing.exceptions.BadRequestException;
import com.csse.ticketing.models.RouteModel;
import com.csse.ticketing.services.JourneyService;

/**
 * 
 * @author Kasun
 *
 */
@RestController
@RequestMapping(value="/routes")
public class RouteController {

	@Autowired
	JourneyService journeyService;
	
	/**
	 * service caller for create a new route
	 * @param route
	 * @return
	 */
	 	@RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<RouteModel> createRoute(@Validated @RequestBody final RouteModel route) {
		 
		 return new ResponseEntity<RouteModel>(journeyService.createRoute(route), HttpStatus.CREATED);
	    }
	 

	 	/**
	 	 * service caller for get route details by id
	 	 * @param routeNo
	 	 * @return
	 	 */
	    @RequestMapping(value = "/{routeNo}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	    public HttpEntity<RouteModel> getRoute(@PathVariable("routeNo") final String routeNo) {

	        return new ResponseEntity<RouteModel>(journeyService.getRoute(routeNo), HttpStatus.OK);
	    }
	    
	   
	    /**
	     * service caller for update a single route    
	     * @param routeNo
	     * @param route
	     * @return
	     */
	    @RequestMapping(value = "/{routeNo}", method = RequestMethod.PUT, produces = APPLICATION_JSON_VALUE,
	            consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<RouteModel> updateRoute(@PathVariable("routeNo") final String routeNo,
	            @Validated @RequestBody final RouteModel route) {

	        if (route.getRouteNo() == null && !route.getRouteNo().equals(routeNo)) {
	            throw new BadRequestException("Invalid route");
	        }

	        return new ResponseEntity<RouteModel>(journeyService.updateRoute(route), HttpStatus.CREATED);
	    }
	    
	  
	    /**
	     * service caller for delete a single route
	     * @param routeNo
	     * @return
	     */
	    @RequestMapping(value = "/{routeNo}", method = RequestMethod.DELETE)
	    public HttpEntity<Void> deleteRoute(@PathVariable("routeNo") final String routeNo) {

	        journeyService.deleteRoute(routeNo);

	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }
}
