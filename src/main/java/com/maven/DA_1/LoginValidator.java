package com.maven.DA_1;

import java.util.ResourceBundle;

public class LoginValidator {
    private ResourceBundle resourceBundle;
    
    // a new function is added
    public boolean LoginChecker(String st) {
    	// a new function
    	return true;
    }

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
    // a comment added to this file - testing poll scm
}
