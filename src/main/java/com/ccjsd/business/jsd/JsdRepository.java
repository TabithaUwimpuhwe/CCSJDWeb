package com.ccjsd.business.jsd;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface JsdRepository extends CrudRepository<Jsd, Integer> {
	
	//Jsd findByUserName(String uname); 
	

}