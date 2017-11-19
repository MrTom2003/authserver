package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controller.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}