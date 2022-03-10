package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Admin;

import com.simplilearn.repository.AdminRepository;

@RestController
@RequestMapping("admin")

public class AdminController {
@Autowired
private AdminRepository repository;

@GetMapping("all")
public List<Admin> getAllAdmins() {
	List<Admin> admins = (List<Admin>) repository.findAll();
	return admins;
}

@PostMapping("add")
public Admin addAdmin(@RequestBody Admin admin) {
	return repository.save(admin);
}
}