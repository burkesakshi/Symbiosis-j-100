package com.example.artistmarketplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.artistmarketplace.entity.User;
import com.example.artistmarketplace.repository.loginRepository;

@Service
public class loginService {

	@Autowired
    private loginRepository loginrepository;
	
	public User login(String email, String password) {
        User user = loginrepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) { // In production, use hashed password comparison
            return user;
        }
        return null; // Return null if login fails
    }
}
