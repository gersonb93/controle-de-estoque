package com.produtos.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.apirest.entities.User;
import com.produtos.apirest.repositores.UserRepositore;


@Service
public class UserService {
	
	@Autowired
	private UserRepositore repositore;

	public List<User> findAll(){
		
		return repositore.findAll();
				
	}
		
	public User findById(Long id) {
	 Optional<User>	obj = repositore.findById(id);
	   return obj.get();
		
			
	}
	
}
