package com.ccjsd.business.auction;

import org.springframework.data.repository.CrudRepository;

// CRUD refers Create, Read, Update, Delete

public interface AuctionRepository extends CrudRepository<Auction, Integer> {
	

}