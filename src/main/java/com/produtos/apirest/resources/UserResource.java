package com.produtos.apirest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.entities.User;


@RestController
@RequestMapping(value = "/Users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1l,"Maria","maria@gmail.com","99999999","12345");
		return ResponseEntity.ok().body(u);
	}
	
	
	
}
