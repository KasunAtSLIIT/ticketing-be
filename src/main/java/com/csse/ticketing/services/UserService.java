package com.csse.ticketing.services;

import com.csse.ticketing.models.UserModel;

public interface UserService {

	/**
	 * @author Kasun
	 * interface for create a new user
	 * @param user
	 * @return
	 */
	UserModel createUser(UserModel user);
}
