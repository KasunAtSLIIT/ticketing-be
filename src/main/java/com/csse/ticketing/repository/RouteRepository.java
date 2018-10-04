package com.csse.ticketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse.ticketing.models.RouteModel;

public interface RouteRepository extends MongoRepository<RouteModel, String> {

}
