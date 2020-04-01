package com.produtos.apirest.config;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.produtos.apirest.entities.User;
import com.produtos.apirest.repositores.UserRepositore;




@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepositore userRepositore;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");  
		/*
		User u1 = new User();
		User u2 = new User();   
		*/
		
		userRepositore.saveAll(Arrays.asList(u1, u2));
		
	}
	
	

}
