package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User1;

@RestController
@CrossOrigin(origins = "http://localhost:5173") 
public class HomeController {

    @PostMapping("/login2")
    public ResponseEntity<?> login(@RequestBody User1 user) {
        System.out.println("Login attempt: " + user);

        Map<String, Object> response = new HashMap<>();

        // Dummy check (replace with DB check later)
        if ("dinesh.official1305@gmail.com".equals(user.getEmail()) && "1234".equals(user.getPassword())) {
            response.put("message", "Login Successful ✅");
            response.put("token", "fake-jwt-token-123456"); // you’ll replace with JWT later
            return ResponseEntity.ok(response);
        } else {
            response.put("message", "Invalid email or password ❌");
            return ResponseEntity.status(401).body(response);
        }
    }
}
