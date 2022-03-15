package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn.controller")
public class FilehandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilehandlingApplication.class, args);
	}

}
