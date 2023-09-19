package com.oauth.demo.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oauth.demo.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
