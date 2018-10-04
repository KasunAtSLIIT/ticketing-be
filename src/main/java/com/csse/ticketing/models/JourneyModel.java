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
@Document(collection = "journeys")
public class JourneyModel {

	@Id
	private String journeyId;
	private String startLocation;
	private String endLocation;
	private String startTime;
	private String endTime;
	private double totalFare;
	private String userId;
	
	/**
	 * Constructor
	 * @param journeyId
	 * @param startLocation
	 * @param endLocation
	 * @param startTime
	 * @param endTime
	 * @param totalFare
	 * @param userId
	 */
	public JourneyModel(String journeyId, String startLocation, String endLocation, String startTime, String endTime,
			double totalFare, String userId) {
		super();
		this.journeyId = journeyId;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.startTime = startTime;
		this.endTime = endTime;
		this.totalFare = totalFare;
		this.userId = userId;
	}

	/**
	 * getters & setters
	 * @return
	 */
	public String getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(String journeyId) {
		this.journeyId = journeyId;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
}
