package com.ccjsd.business.image;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int pictureId;
	private String pictureUrl;
	private String item;
	
	public Image(int pictureId, String pictureUrl, String item) {
		super();
		this.pictureId = pictureId;
		this.pictureUrl = pictureUrl;
		this.item = item;
	}
	
	public Image(String url, String item) {
		
		setPictureURL (url); 
		setItem (item);
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	public String getPictureURL() {
		return pictureUrl;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureUrl = pictureUrl;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

		
	@Override
	public String toString() {
		return "Image [pictureId=" + pictureId + ", pictureUrl=" + pictureUrl + ", item=" + item + "]";
	}
	
}