package com.csse.ticketing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csse.ticketing.models.Context;
import com.csse.ticketing.models.ForeignUserFareModel;
import com.csse.ticketing.models.JourneyModel;
import com.csse.ticketing.models.LocalUserFareModel;
import com.csse.ticketing.models.UserModel;
import com.csse.ticketing.services.JourneyService;
import com.csse.ticketing.services.UserService;

@RestController
@RequestMapping(value = "/journey")
public class JourneyController {

	@Autowired
	JourneyService journeyService;
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public HttpEntity<JourneyModel> createJourney(@Validated @RequestBody final JourneyModel journey) {

		UserModel user = userService.getUser(journey.getUser());
		
		Context context;

		if (user.getType().equalsIgnoreCase("local")) {
			context=new Context(new LocalUserFareModel());
			journey.setFare(context.executeStatergy(journey));
		}
		
		if (user.getType().equalsIgnoreCase("foreign")) {
			context=new Context(new ForeignUserFareModel());
			journey.setFare(context.executeStatergy(journey));
		}
		return new ResponseEntity<JourneyModel>(journeyService.createJourney(journey),HttpStatus.OK));
	}

}
