package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.UserProductPurchased;
import com.simplilearn.repository.UserProductPurchasedRepository;

@RestController
@RequestMapping("purchased/products")
public class UserProductPurchasedController {
	@Autowired
	UserProductPurchasedRepository userProductPurchasedRepository;
	
	@GetMapping("all")
	public List<UserProductPurchased> getAllPurchasedProducts() {
		List<UserProductPurchased> purchasedProducts = (List<UserProductPurchased>)userProductPurchasedRepository.findAll();
		return purchasedProducts;
	}
	
	@PostMapping("add")
	public UserProductPurchased addUserProductPurchased(@RequestBody UserProductPurchased userProductPurchased) {
		return userProductPurchasedRepository.save(userProductPurchased);
	}
}