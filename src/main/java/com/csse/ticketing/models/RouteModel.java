package com.csse.ticketing.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author Kasun
 */
@JsonInclude(Include.ALWAYS)
@Document(collection = "routes")
public class RouteModel {

	@Id
	private String id;
	private String startTime;
	private String endTime;
	private double totalFare;
	private String accountId;
	
	/**
	 * constructor
	 * @param id
	 * @param startTime
	 * @param endTime
	 * @param totalFare
	 * @param accountId
	 */
	public RouteModel(String id, String startTime, String endTime, double totalFare, String accountId) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.totalFare = totalFare;
		this.accountId = accountId;
	}
	
	/**
	 * getters & setters
	 * @return
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	
	
}
