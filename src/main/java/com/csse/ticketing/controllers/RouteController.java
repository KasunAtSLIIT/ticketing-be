package com.csse.ticketing.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
	
	 @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<RouteModel> createRoute(@Validated @RequestBody final RouteModel route) {
		 
		 return new ResponseEntity<RouteModel>(journeyService.createRoute(route), HttpStatus.CREATED);
	    }
}
