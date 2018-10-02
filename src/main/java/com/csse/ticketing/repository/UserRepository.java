package com.csse.ticketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.csse.ticketing.models.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {

}
