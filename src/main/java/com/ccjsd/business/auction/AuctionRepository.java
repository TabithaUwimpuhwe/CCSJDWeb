package com.ccjsd.business.auction;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AuctionRepository extends CrudRepository<Auction, Integer> {
	
	//Actor findByUserNameAndPassword (String uname, String pwd); //biz logic
	

}