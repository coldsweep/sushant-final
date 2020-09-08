package com.MvcProject.LoginMicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer UserId;
	private String name;
	private String password;
	
	public Integer getUserId() {
		return UserId;
	}
	public void setuserId(Integer UserId) {
		this.UserId = UserId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
