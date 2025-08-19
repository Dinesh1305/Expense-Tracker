package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;

@RestController

@CrossOrigin(origins = "http://localhost:5173") 
public class HomeController {


    
    
    
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User name ){
    	
    	System.out.println(name);
        return ResponseEntity.ok("Login Successful ✅");
    }
}
