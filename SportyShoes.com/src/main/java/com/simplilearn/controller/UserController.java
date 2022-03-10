package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.User;
import com.simplilearn.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("all")
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}
	
	@PostMapping("add")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
