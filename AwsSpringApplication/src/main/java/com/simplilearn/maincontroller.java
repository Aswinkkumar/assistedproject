package com.simplilearn;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class maincontroller {
	@GetMapping(value = "/test")
	public String test()
	{
		return "Hello World";
	}}