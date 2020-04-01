package com.produtos.apirest.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.entities.User;

public interface UserRepositore extends JpaRepository<User, Long> {
	
	

}
