package com.csse.ticketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse.ticketing.models.HaltModel;

public interface HaltRepository extends MongoRepository<HaltModel, String>{

}
