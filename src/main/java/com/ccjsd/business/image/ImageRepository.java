package com.ccjsd.business.image;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ImageRepository extends CrudRepository<Image, Integer> {
	
	//Actor findByUserNameAndPassword (String uname, String pwd); //biz logic
	

}