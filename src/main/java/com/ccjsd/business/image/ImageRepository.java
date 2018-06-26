package com.ccjsd.business.image;

import org.springframework.data.repository.CrudRepository;

// CRUD refers Create, Read, Update, Delete

public interface ImageRepository extends CrudRepository<Image, Integer> {
	
}