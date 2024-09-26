package com.dawn.lift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dawn.lift.service.UserService;

public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/auth/signup")
    public ResponseEntity<String> signupUser(@RequestBody String u, @RequestBody String p) {

        try {
            userService.createUser(u, p);
            return ResponseEntity.ok("User created successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error creating user");
        }

    }
    
}
