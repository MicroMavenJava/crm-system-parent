package com.project.crm.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableJpaRepositories("com.project.crm.dbutility.repository")
@EntityScan("com.project.crm.dbutility.entity")
@ComponentScan(basePackages = {
        "com.project.crm.usermanagement",
        "com.example.crmusermanagement.controller",
        "com.project.crm.dbutility"
})
public class CrmUserManagementApplication
{
    public static void main(String[] args) {
        SpringApplication.run(CrmUserManagementApplication.class, args);
    }
}
