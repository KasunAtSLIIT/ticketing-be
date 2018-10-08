package com.csse.ticketing.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse.ticketing.models.AccountModel;

public interface AccountRepository extends MongoRepository<AccountModel, String>{
 
	AccountModel findAccountModelByAccountId(String accountId);
	
}
