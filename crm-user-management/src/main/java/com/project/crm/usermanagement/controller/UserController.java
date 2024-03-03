package com.project.crm.usermanagement.controller;

import com.project.crm.base.model.user.UserRegistrationDTO;
import com.project.crm.dbutility.entity.User;
import com.project.crm.dbutility.repository.UserRepository;
import com.project.crm.usermanagement.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRegistrationService userRegistrationService;



    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        userRegistrationService.registerNewUser(userRegistrationDTO);
        return null;
    }

}