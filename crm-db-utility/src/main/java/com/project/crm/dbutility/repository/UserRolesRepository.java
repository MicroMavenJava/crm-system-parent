package com.project.crm.dbutility.repository;

import com.project.crm.dbutility.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {

    // Additional methods for querying and managing user roles, if needed

}
