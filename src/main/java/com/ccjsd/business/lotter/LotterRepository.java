package com.ccjsd.business.lotter;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface LotterRepository extends CrudRepository<Lotter, Integer> {
	
	Lotter findByUserNameAndPassword (String uname, String pwd); //biz logic
	

}