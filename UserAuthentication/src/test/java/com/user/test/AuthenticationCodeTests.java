package com.user.test;


 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.user.entities.User;
import com.user.exceptions.UserNotFoundException;
import com.user.repositories.AuthenticationRepository;
import com.user.services.AuthenticationService;

@DataJpaTest
public class AuthenticationCodeTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private AuthenticationService authService;

	@Autowired
	private AuthenticationRepository authRepo;
 
	private User testUser;
	
	@BeforeEach
	private void Setup() {
		testUser = new User("Aswin", "aswin@gmail.com", "aswin111");
		System.out.println(testUser.toString());
		entityManager.persist(testUser);
		entityManager.flush();
	}

	@Test
	public void shouldGetUserByName() {
		User test = authService.GetUserByName("Aswin");
		assertEquals(testUser.getName(), test.getName());
	}

	@Test
	public void shouldFindUserByName() throws UserNotFoundException {
		Optional<User> temp = authRepo.findUserByName("Aswin");
		User tempUser = (temp.isPresent()) ? temp.get() : new User();
		assertEquals(testUser.getName(), tempUser.getName());
		tempUser = new User();
		assertFalse(testUser.getName().equals(tempUser.getName()));
	}
	
	@Test
	public void shouldValidateUser() {
		// incorrect username
		User input = new User("Ashish", "Dominic");	
		Optional<User> temp = authRepo.findUserByName(input.getName());
		User tempUser = (temp.isPresent()) ? temp.get() : new User();
		assertFalse(testUser.getName().equals(input.getName()));
		
		// incorrect password but correct username
		input.setName("Aswin");
		temp = authRepo.findUserByName(input.getName());
		tempUser = (temp.isPresent()) ? temp.get() : new User();
		assertFalse(authService.isValidPassword(tempUser.getPassword(), input.getPassword()));
		
		//correct username and password
		input.setPassword("aswin111");
		assertTrue(authService.isValidPassword(tempUser.getPassword(), input.getPassword()));
	}

}