package com.csse.ticketing.models;

/**
 * 
 * @author Kasun
 *
 */
public class HaltModel {

	private String id;
	private String haltNo;
	private String name;
	private String nextHalt;
	private String previousHalt;
	private String routNo;
	
	/**
	 * constructor
	 * @param id
	 * @param name
	 * @param nextHalt
	 * @param previousHalt
	 * @param routId
	 */
	public HaltModel(String id, String haltNo, String name, String nextHalt, String previousHalt, String routNo) {
		super();
		this.id = id;
		this.haltNo = haltNo;
		this.name = name;
		this.nextHalt = nextHalt;
		this.previousHalt = previousHalt;
		this.routNo = routNo;
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
	public String getHaltNo() {
		return haltNo;
	}

	public void setHaltNo(String haltNo) {
		this.haltNo = haltNo;
	}

	public String getRoutNo() {
		return routNo;
	}

	public void setRoutNo(String routNo) {
		this.routNo = routNo;
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
		return routNo;
	}
	public void setRoutId(String routNo) {
		this.routNo = routNo;
	}
		
	
}
