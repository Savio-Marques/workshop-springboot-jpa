package com.projectwebservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebservices.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
