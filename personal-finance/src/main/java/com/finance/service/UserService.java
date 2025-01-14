package com.finance.service;

import com.finance.repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();

    public void registerUser(String username, String password) {
        boolean isRegistered = userRepo.register(username, password);
        if (isRegistered) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("User already exists.");
        }
    }

    public void loginUser(String username, String password) {
        boolean isLoggedIn = userRepo.login(username, password);
        if (isLoggedIn) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
