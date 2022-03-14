package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn")
public class RestfullWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebservicesApplication.class, args);
	}

}
