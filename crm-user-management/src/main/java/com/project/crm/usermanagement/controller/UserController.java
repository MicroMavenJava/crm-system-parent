package com.project.crm.usermanagement.controller;

import com.project.crm.dbutility.entity.User;
import com.project.crm.dbutility.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;



    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User newUser) {
        // Check if the username is already taken
        if (userRepository.findByUsername(newUser.getUsername()) != null) {
            // You might want to handle this differently, e.g., throw an exception or return an error response
            throw new RuntimeException("Username already taken");
        }

        // Hash the user's password before saving it to the database
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));

        // Set a default role for new users (modify this based on your logic)
        // Assuming a role named "ROLE_USER" exists in the database
        newUser.setRoles(userRepository.findByRoles_Name("ROLE_USER"));

        // Save the new user to the database
        return userRepository.save(newUser);
    }

}