package com.dawn.lift.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.dawn.lift.domain.User;
// import the user repository
import com.dawn.lift.repository.UserRepository;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User createUser(String u, String p) {
        return userRepository.createUser(u, p);
    }
    
}
