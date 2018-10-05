package com.csse.ticketing.serviceImpl;

import java.util.Optional;

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
	private UserRepository userRepo;
	
	/**
	 * create user implementation
	 */
	@Override
	public UserModel createUser(UserModel user){
		return userRepo.save(user);
	}
	
	/**
	 * get user by id implementation
	 */
	
	@Override
	public UserModel getUser(final String username){
//		 final UserModel user = userRepo.findUserModelByUsername(username);
		 return userRepo.findUserModelByUsername(username);
	}


	@Override
	public UserModel updateUser(String username,UserModel user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
}
