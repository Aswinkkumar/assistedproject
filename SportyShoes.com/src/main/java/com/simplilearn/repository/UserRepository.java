package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}