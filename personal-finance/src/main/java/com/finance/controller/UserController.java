package com.finance.controller;

import com.finance.service.UserService;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserService();

    public void runApplication() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    userService.registerUser(username, password);
                    break;
                case 2:
                    System.out.print("Enter Username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPassword = scanner.nextLine();
                    userService.loginUser(loginUsername, loginPassword);
                    break;
                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
