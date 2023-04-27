package com.springboot.simplebootproject.controller;

import com.springboot.simplebootproject.Entity.User;
import com.springboot.simplebootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return user1;
    }

    @GetMapping("/")
    public List<User> getAllUsers(){
        List<User> users = userService.getAllUser();
        return users;
    }
}
