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




/**
 * 
 * @author Kasun
 *
 */
@RestController
@RequestMapping(value="/haltes")
public class HaltController {
	/*@Autowired
	RouteService routeService;
	
	 @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<HaltModel> createHalt(@Validated @RequestBody final HaltModel halt) {
		 return new ResponseEntity<HaltModel>(routeService.createHalt(halt), HttpStatus.CREATED);
	    }*/
}
