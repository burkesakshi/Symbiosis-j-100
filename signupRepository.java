package com.example.artistmarketplace.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.artistmarketplace.entity.User;

@Repository
public interface signupRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByName(String name);

	 Optional<User> findById(Integer id);
}
