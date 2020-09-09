package com.lh.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

	private Integer id;
	private String name;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date brith;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(Integer id, String name, Date brith) {
		super();
		this.id = id;
		this.name = name;
		this.brith = brith;
	}



	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the brith
	 */
	public Date getBrith() {
		return brith;
	}
	/**
	 * @param brith the brith to set
	 */
	public void setBrith(Date brith) {
		this.brith = brith;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", brith=" + brith + "]";
	}
	
}
