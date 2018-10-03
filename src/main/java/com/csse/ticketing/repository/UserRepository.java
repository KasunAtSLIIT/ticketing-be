package com.csse.ticketing.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.csse.ticketing.models.UserModel;


public interface UserRepository extends MongoRepository<UserModel, String> {

	UserModel findUserModelByUsername(final String username);
}
