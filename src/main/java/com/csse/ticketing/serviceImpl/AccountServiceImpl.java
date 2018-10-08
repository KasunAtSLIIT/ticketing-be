package com.csse.ticketing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csse.ticketing.exceptions.DataNotFoundException;
import com.csse.ticketing.models.AccountModel;
import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.repository.AccountRepository;
import com.csse.ticketing.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepo;
	
	/**
	 * update account with new balance
	 */
	@Override
	public AccountModel updateAccount(AccountModel account){
		final AccountModel existAccount = accountRepo.findAccountModelByAccountId(account.getAccountId());
            if(existAccount==null){
            	throw new DataNotFoundException("The requested account is not found");
            }
            if(account.isRecharge()==true){
            	existAccount.setAccountId(account.getAccountId());
            	existAccount.setBalance(existAccount.getBalance()+account.getBalance());
            	existAccount.setUsername(account.getUsername());
            }

		  return accountRepo.save(existAccount);
      
	}
}
