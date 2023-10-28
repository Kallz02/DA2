package com.maven.DA_1;

import java.util.ResourceBundle;

public class LoginValidator {
    private ResourceBundle resourceBundle;

    public LoginValidator() {
        // Load the resource bundle named "config" (config.properties)
        resourceBundle = ResourceBundle.getBundle("config");
    }

    // This is a change made by Akshay

    public boolean validateCredentials(String username, String password) {
        String actualUsername = resourceBundle.getString("username");
        String actualPassword = resourceBundle.getString("password");

        boolean result = (username.equals(actualUsername) && password.equals(actualPassword));

        return result;
    }
}
