package com.springboot.simplebootproject.service.impl;

import com.springboot.simplebootproject.Entity.User;
import com.springboot.simplebootproject.repository.UserRepo;
import com.springboot.simplebootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userRepo.findAll();
        return users;
    }
}
