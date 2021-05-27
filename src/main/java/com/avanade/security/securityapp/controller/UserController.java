package com.avanade.security.securityapp.controller;

import com.avanade.security.securityapp.model.UserModel;
import com.avanade.security.securityapp.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
public class UserController {


    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/list-all")
    public Iterable<UserModel> listAll(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody UserModel userModel){
        userRepository.save(userModel);
    }
}
