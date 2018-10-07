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
	private String routeNo;
	private String name;
	private String distance;
	private double fare;
	private String startPoint;
	private String endPoint;
	
	/**
	 * constructor
	 * @param id
	 * @param startTime
	 * @param endTime
	 * @param totalFare
	 * @param accountId
	 */
	public RouteModel(String id, String routeNo, String name, String distance, double fare, String startPoint,
			String endPoint) {
		super();
		this.id = id;
		this.routeNo = routeNo;
		this.name = name;
		this.distance = distance;
		this.fare = fare;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistance() {
		return distance;
	}
	public String getRouteNo() {
		return routeNo;
	}

	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	
	
	
}
