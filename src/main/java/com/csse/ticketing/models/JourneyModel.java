package com.csse.ticketing.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journey")
public class JourneyModel {

	@Id
	private String key;
	private String user;
	private String startPoint;
	private double startPoint_lat;
	private double startPoint_long;
	private Date start_time;
	private String endPoint;
	private double endPoint_lat;
	private double endPoint_long;
	private Date end_time;
	private double distance;
	private double fare;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public double getStartPoint_lat() {
		return startPoint_lat;
	}
	public void setStartPoint_lat(double startPoint_lat) {
		this.startPoint_lat = startPoint_lat;
	}
	public double getStartPoint_long() {
		return startPoint_long;
	}
	public void setStartPoint_long(double startPoint_long) {
		this.startPoint_long = startPoint_long;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public double getEndPoint_lat() {
		return endPoint_lat;
	}
	public void setEndPoint_lat(double endPoint_lat) {
		this.endPoint_lat = endPoint_lat;
	}
	public double getEndPoint_long() {
		return endPoint_long;
	}
	public void setEndPoint_long(double endPoint_long) {
		this.endPoint_long = endPoint_long;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	public JourneyModel(String key, String user, String startPoint, double startPoint_lat, double startPoint_long,
			Date start_time) {
		super();
		this.key = key;
		this.user = user;
		this.startPoint = startPoint;
		this.startPoint_lat = startPoint_lat;
		this.startPoint_long = startPoint_long;
		this.start_time = start_time;
	}
	
	public JourneyModel() {
		super();
		
	}
	
	
	
}
