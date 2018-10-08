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
import org.springframework.web.bind.annotation.RestController;

import com.csse.ticketing.exceptions.BadRequestException;
import com.csse.ticketing.models.AccountModel;
import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.services.AccountService;

/**
 * 
 * @author Kasun
 *
 */
@RestController
@RequestMapping(value="/accounts")
public class AccountController {

	@Autowired
	private AccountService accSerivc;
	
	/**
	 * service caller for update or recharge balance in account
	 * @param accountId
	 * @param account
	 * @return
	 */
	 @RequestMapping(value = "/{accountId}", method = RequestMethod.PUT, produces = APPLICATION_JSON_VALUE,
	            consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<AccountModel> updateHalt(@PathVariable("accountId") final String accountId,
	            @Validated @RequestBody final AccountModel account) {

	        if (account.getAccountId() == null && !account.getAccountId().equals(accountId)) {
	            throw new BadRequestException("Account cant defined");
	        }

	        return new ResponseEntity<AccountModel>(accSerivc.updateAccount(account), HttpStatus.CREATED);
	    }
}
