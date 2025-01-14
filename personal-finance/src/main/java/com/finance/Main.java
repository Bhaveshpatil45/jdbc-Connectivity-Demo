package com.finance;

import com.finance.controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.runApplication();
    }
}
