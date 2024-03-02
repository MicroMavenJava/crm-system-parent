package com.project.crm.dbutility.repository;

import com.project.crm.dbutility.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Find a user by username
    User findByUsername(String username);

    // Find a user by email
    User findByEmail(String email);

    // Find users by a certain role
    List<User> findByRoles_Name(String roleName);


}