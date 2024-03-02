package com.project.crm.dbutility.repository;

import com.project.crm.dbutility.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // You can add custom queries if needed

}