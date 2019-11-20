package com.spring.sample.api.controller;

import com.spring.sample.api.domain.User;
import com.spring.sample.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public User createUser(User user){
        User savedUser = userService.save(user);
        return savedUser;
    }

    @GetMapping()
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/email")
    public User FindByEmail(String email){
        return userService.findByEmail(email);
    }

    @GetMapping("/lastname")
    public List<User> FindAllByLastName(String lastname){
        return userService.findByLastName(lastname);
    }
}
