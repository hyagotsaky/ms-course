package com.hyago.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyago.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
