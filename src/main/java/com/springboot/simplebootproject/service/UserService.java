package com.springboot.simplebootproject.service;

import com.springboot.simplebootproject.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    List<User> getAllUser();

}
