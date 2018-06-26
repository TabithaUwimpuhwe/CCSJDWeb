package com.ccjsd.business.lotter;

import org.springframework.data.repository.CrudRepository;

// CRUD refers Create, Read, Update, Delete

public interface LotterRepository extends CrudRepository<Lotter, Integer> { 
	

}