package com.maven.DA_1;

import java.util.ResourceBundle;

public class LoginValidator {
    private ResourceBundle resourceBundle;

    public LoginValidator() {
        // Load the resource bundle named "config" (config.properties)
        resourceBundle = ResourceBundle.getBundle("config");
    }

    public boolean validateCredentials(String username, String password) {
        String actualUsername = resourceBundle.getString("username");
        String actualPassword = resourceBundle.getString("password");
        
        boolean result = (username.equals(actualUsername) && password.equals(actualPassword));
        
        return result;
    }
    // This change is made by Janakiraman 20MIC0009
    // Git hub link:https://github.com/Kallz02/DA2.git

}
