package com.ccjsd.business.lotter;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Lotter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;

	
public Lotter() {
		super();
	}

//	public Lotter() {
//		userName = "";
//		
//	}
	
	public Lotter(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
		
	}

	public Lotter(String un) {
		setUserName(un);
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]"; 
	}
}