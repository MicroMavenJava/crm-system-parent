package com.project.crm.usermanagement.service;

import com.project.crm.base.model.user.UserRegistrationDTO;
import com.project.crm.dbutility.entity.Role;
import com.project.crm.dbutility.entity.User;
import com.project.crm.dbutility.entity.UserRoles;
import com.project.crm.dbutility.repository.RoleRepository;
import com.project.crm.dbutility.repository.UserRepository;
import com.project.crm.dbutility.repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private  RoleRepository roleRepository;

    @Autowired
    private  UserRolesRepository userRolesRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public void registerNewUser(UserRegistrationDTO registrationDTO) {
        // Create a new user entity
        User newUser = new User();
        newUser.setUsername(registrationDTO.getUsername());
        newUser.setPassword(passwordEncoder.encode(registrationDTO.getPassword()));
        newUser.setEmail(registrationDTO.getEmail());

        // Find the role by name (e.g., "ROLE_USER")
        Role userRole = roleRepository.findByName("ROLE_USER");

        System.out.println(userRole.toString());

        // Set roles for the user
        Set<Role> roles = new java.util.HashSet<>();
        roles.add(userRole);
        newUser.setRoles(roles);

        // Save the user to the database
        userRepository.save(newUser);

        // Create a user_roles record to associate the user with the role
//        UserRoles userRoles = new UserRoles();
//        userRoles.setUser(newUser);
//        userRoles.setRole(userRole);
//        userRolesRepository.save(userRoles);
    }
}
