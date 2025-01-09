package com.example.artistmarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.artistmarketplace.entity.User;
import com.example.artistmarketplace.service.loginService;

@RestController
@RequestMapping("/api")
public class loginController {
	
	  @Autowired
	    private loginService loginservice;
	
	  @PostMapping("/login")
	    public ResponseEntity<User> login(@RequestBody User loginUser ) {
	        User user = loginservice.login(loginUser .getEmail(), loginUser .getPassword());
	        if (user != null) {
	            return ResponseEntity.ok(user); // Return user details on successful login
	        }
	        return ResponseEntity.status(401).body(null); // Unauthorized
	    }

}
