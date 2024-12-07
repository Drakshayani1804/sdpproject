package com.example.propertyspringbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.propertyspringbackend.model.User;
import com.example.propertyspringbackend.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public boolean checkIfUserExists(String email) {
        return userRepository.findByEmail(email) != null;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
    public boolean validateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }

}
