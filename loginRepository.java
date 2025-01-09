package com.example.artistmarketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.artistmarketplace.entity.User;

public interface loginRepository extends JpaRepository<User, Integer> {
	
	 User findByEmail(String email);

}
