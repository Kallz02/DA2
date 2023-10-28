package com.maven.DA_1;

import com.maven.DA_1.LoginValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidatorTest {

    @Test
    public void testValidCredentials() {
        LoginValidator loginValidator = new LoginValidator();
        
        System.out.println("[TEST CASE 1]: Testing with the correct username and password !!");
        
        boolean result = loginValidator.validateCredentials("AK", "20MIC0071");
        
        Assert.assertEquals(result, true, "Expected TRUE but got FALSE");
    }

    @Test
    public void testInvalidCredentials() {
        LoginValidator loginValidator = new LoginValidator();
        
        System.out.println("[TEST CASE 2]: Testing with an incorrect username and password combination !!");
        
        boolean result = loginValidator.validateCredentials("wrong_username", "wrong_password");
        
        Assert.assertEquals(result, false, "Expected FALSE but got TRUE");
    }
}