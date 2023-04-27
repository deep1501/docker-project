package com.springboot.simplebootproject.repository;

import com.springboot.simplebootproject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
