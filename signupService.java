package com.example.artistmarketplace.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.artistmarketplace.entity.User;
import com.example.artistmarketplace.repository.signupRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class signupService {
    
	private  signupRepository signuprepository;

	public List<User> getAllUsers() {
		
		List<User> userlist=signuprepository.findAll();
	
		System.out.println(userlist);
        return signuprepository.findAll();
    }
	
	
	public User postsignup(User user) {
        return signuprepository.save(user);
    }
	
	
}