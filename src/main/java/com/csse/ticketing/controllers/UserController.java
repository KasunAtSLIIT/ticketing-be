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

import com.csse.ticketing.models.UserModel;
import com.csse.ticketing.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	 
	/**
	 * @author Kasun
	 * creating a new user controller method
	 */
		@Autowired
		UserService userService;
		 @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
		    public HttpEntity<UserModel> createNote(@Validated @RequestBody final UserModel user) {
			 return new ResponseEntity<UserModel>(userService.createUser(user), HttpStatus.CREATED);
		    }
	
}
