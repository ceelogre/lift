package com.dawn.lift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawn.lift.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User createUser(String username, String password);
    
}
