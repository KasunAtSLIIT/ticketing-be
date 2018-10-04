package com.csse.ticketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse.ticketing.models.JourneyModel;

public interface JourneyRepository extends MongoRepository<JourneyModel, String>{

	JourneyModel findOne(String id);

}
