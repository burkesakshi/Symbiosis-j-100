package com.example.artistmarketplace.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.artistmarketplace.entity.User;
import com.example.artistmarketplace.repository.signupRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") 
public class signupController {
	
	@Autowired
    private signupRepository srepository; 
	
	
	public signupController(signupRepository srepository) {
        super();
        this.srepository = srepository;
    }
	

	@PostMapping("/users")
    public ResponseEntity<User> saveClient(@RequestBody User user) {
    	System.out.println("client records:"+ user);
       return new ResponseEntity<>(srepository.save(user), HttpStatus.CREATED);
    }
    
    /*@GetMapping("/GetAllusers")
    public List<User> getAllClients() {
        return srepository.findAll(); 
    } */
    
}
