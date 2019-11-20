package com.spring.sample.api.service;

import com.spring.sample.api.domain.User;
import com.spring.sample.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save (User user){
        return userRepository.save(user);
    }

    public List<User> findAllUser(){

        return userRepository.findAll();
    }

    public User findByEmail(String email){
        return userRepository.findAllByEmail(email).get(0);
    }

    public List<User> findByLastName(String lastname){
        return userRepository.findAllByLastname(lastname);
    }



}
