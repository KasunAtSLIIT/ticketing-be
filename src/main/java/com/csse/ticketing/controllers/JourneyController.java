package com.csse.ticketing.controllers;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csse.ticketing.models.ChildUserFareModel;
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
		System.out.println(user.getType());
		String user_type = user.getType();
		
		//trim distance
		Double distance = journey.getDistance();
		distance=(double) Math.round(distance * 100) / 100;
		System.out.println(user.getType());
		
		//calculate age
		String[] dob = (user.getDob()).split("-");
		int year = Integer.parseInt(dob[0]);
		int month = Integer.parseInt(dob[1]);
		int bdate = Integer.parseInt(dob[2]);
		
		LocalDate birthdate =LocalDate.of(year, month, bdate);      //Birth date
		LocalDate now = LocalDate.of(2018,10,8);                      //Today's date
		 
		int age = Period.between(birthdate, now).getYears();
		System.out.println(age);

		//strategy pattern used to calculate distance
		Context context;

		if (age < 19) {
			context=new Context(new ChildUserFareModel());
			journey.setFare(context.executeStatergy(journey));
		}
		
		else if (user_type.equalsIgnoreCase("Local")) {
			context=new Context(new LocalUserFareModel());
			journey.setFare(context.executeStatergy(journey));
		}
		
		else if (user_type.equalsIgnoreCase("Foreign")) {
			context=new Context(new ForeignUserFareModel());
			journey.setFare(context.executeStatergy(journey));
		}
			
		//check user balance
		System.out.println(journey.getFare());
		System.out.println(user.getBalance());

		double balance= user.getBalance()-journey.getFare();
		balance=(double) Math.round(balance * 100) / 100;
		System.out.println(balance);
		journey.setBalance(balance);

		return new ResponseEntity<JourneyModel>(journeyService.createJourney(journey),HttpStatus.OK);
	}

}
