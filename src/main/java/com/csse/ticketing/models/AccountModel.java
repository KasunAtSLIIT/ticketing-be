package com.csse.ticketing.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class AccountModel {

	@Id
	private String accountId;
	private float balance;
	private String username;
	private boolean isRecharge;
	
	
	
	public AccountModel(String accountId, float balance, String username, boolean isRecharge) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.username = username;
		this.isRecharge = isRecharge;
	}
	/**
	 * getters and setters
	 * @return
	 */
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isRecharge() {
		return isRecharge;
	}
	public void setRecharge(boolean isRecharge) {
		this.isRecharge = isRecharge;
	}
	
}
