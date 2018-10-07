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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csse.ticketing.exceptions.DataNotFoundException;
import com.csse.ticketing.models.LoginModel;
import com.csse.ticketing.models.UserModel;
import com.csse.ticketing.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	/**
	 * @author Kasun creating a new user controller method
	 */
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	public HttpEntity<UserModel> createNote(@Validated @RequestBody final UserModel user) {
		
		return new ResponseEntity<UserModel>(userService.createUser(user), HttpStatus.CREATED);
	}

	/**
	 * auth service
	 * 
	 * @param login
	 * @return
	 */
	@ResponseBody
	@RequestMapping(path = "/login", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
	public HttpEntity<UserModel> getUser(@Validated @RequestBody final LoginModel login) {
		
		UserModel user = userService.getUser(login.getUsername());
		
		if (!user.getPassword().equals(login.getPassword())) {
			throw new DataNotFoundException("Invalid password");
		}
		
		return new ResponseEntity<UserModel>(userService.getUser(login.getUsername()), HttpStatus.OK);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HttpEntity<UserModel> getUserDetails(@PathVariable("id") final String id) {

		return new ResponseEntity<UserModel>(userService.getUser(id), HttpStatus.OK);       
    }
	
	/**
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	 @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	    public HttpEntity<UserModel> updateBalance(@PathVariable("id") final String id, @Validated @RequestBody final UserModel user) {

			return new ResponseEntity<UserModel>(userService.updateUser(id,user), HttpStatus.OK);       
	    }
}
