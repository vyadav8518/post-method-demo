package com.example.post_method_demo.service;

import org.springframework.stereotype.Service;

import com.example.post_method_demo.dto.UserDTO;

@Service
public class UserService {
    public String registerUser(UserDTO userDTO) {
        // Simple validation
        if (userDTO == null) {
            throw new IllegalArgumentException("User data cannot be null");
        }
        return "User " + userDTO.getName() + " registered successfully";
    }
}