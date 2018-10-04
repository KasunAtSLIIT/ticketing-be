package com.csse.ticketing.models;

/**
 * 
 * @author Kasun
 *
 */
public class HaltModel {

	private String id;
	private String name;
	private String nextHalt;
	private String previousHalt;
	private String routId;
	
	/**
	 * constructor
	 * @param id
	 * @param name
	 * @param nextHalt
	 * @param previousHalt
	 * @param routId
	 */
	public HaltModel(String id, String name, String nextHalt, String previousHalt, String routId) {
		super();
		this.id = id;
		this.name = name;
		this.nextHalt = nextHalt;
		this.previousHalt = previousHalt;
		this.routId = routId;
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
	public String getNextHalt() {
		return nextHalt;
	}
	public void setNextHalt(String nextHalt) {
		this.nextHalt = nextHalt;
	}
	public String getPreviousHalt() {
		return previousHalt;
	}
	public void setPreviousHalt(String previousHalt) {
		this.previousHalt = previousHalt;
	}
	public String getRoutId() {
		return routId;
	}
	public void setRoutId(String routId) {
		this.routId = routId;
	}
		
	
}
