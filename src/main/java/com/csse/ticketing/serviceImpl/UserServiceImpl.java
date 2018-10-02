package com.csse.ticketing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csse.ticketing.models.UserModel;
import com.csse.ticketing.repository.UserRepository;
import com.csse.ticketing.services.UserService;

/**
 * 
 * @author Kasun
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	UserRepository userRepo;
	
	/**
	 * create user implementation
	 */
	public UserModel createUser(UserModel user){
		return userRepo.save(user);
	}
}
