package com.example.load_testing_project.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Token {

    @GetMapping("/api/token")
    public String getSysToken() {
        // Replace with your actual token generation logic
        return "{\"token\": \"yourGeneratedToken\"}"; // Example
    }
}