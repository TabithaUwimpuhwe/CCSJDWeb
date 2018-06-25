package com.ccjsd.business.auction;


import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Auction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private Timestamp startDateTime;
	private Timestamp endDateTime;
//	private LocalDateTime dateCreated;
	
	
	public Auction(int id, String title, Timestamp startDateTime, Timestamp endDateTime) {
	super();
	this.id = id;
	this.title = title;
	this.startDateTime = startDateTime;
	this.endDateTime = endDateTime;
}
	
	public Auction() {
		super();
	}

	public Auction (String title, Timestamp sdt, Timestamp edt) {
		setStartDateTime (sdt);
		setEndDateTime (edt);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Timestamp startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Timestamp getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Timestamp endDateTime) {
		this.endDateTime = endDateTime;
	}

@Override
public String toString() {
	return "Auction [id=" + id + ", title=" + title + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
			+ "]"; //removed dateCreated+ to let it be auto generated
	}
}