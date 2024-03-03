package com.project.crm.dbutility.repository;

import com.project.crm.dbutility.entity.Role;
import com.project.crm.dbutility.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find a user by username
    User findByUsername(String username);

    // Find a user by email
    User findByEmail(String email);

    // Find users by a certain role
    Set<Role> findByRoles_Name(String roleName);


}