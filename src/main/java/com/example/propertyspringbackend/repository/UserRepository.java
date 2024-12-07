package com.example.propertyspringbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.propertyspringbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	 User findByEmail(String email); 
}
