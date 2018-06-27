package com.ccjsd.business.auction;

import java.sql.Timestamp;

import org.springframework.data.repository.CrudRepository;

import com.ccjsd.business.auction.Auction;

// CRUD refers Create, Read, Update, Delete

public interface AuctionRepository extends CrudRepository<Auction, Integer> {
	
	Auction findByEndDateTime (Timestamp endDateTime); 
}