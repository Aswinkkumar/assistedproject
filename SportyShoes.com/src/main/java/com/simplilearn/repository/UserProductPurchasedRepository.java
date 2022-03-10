package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.model.UserProductPurchased;

public interface UserProductPurchasedRepository extends CrudRepository<UserProductPurchased, Integer> {
	
}