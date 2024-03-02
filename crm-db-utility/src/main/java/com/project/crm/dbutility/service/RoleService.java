package com.project.crm.dbutility.service;


import com.project.crm.dbutility.entity.Role;
import com.project.crm.dbutility.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role getRoleByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }

    // Additional methods as needed
}