package com.example.diabControl.repository;

import com.example.diabControl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User,Long>{
    User findByUsername(String username);
}
