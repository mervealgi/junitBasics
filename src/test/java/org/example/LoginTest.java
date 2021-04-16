package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    Login login;

    @Before
    public void setUp(){
        login = new Login();
    }

    @Test
    public void loginUserTest(){
        Assert.assertTrue("Login error!", login.loginUser("username", "12345").equals(true));   //Expected return true

        Assert.assertEquals("Login error!", "Error", login.loginUser("username", "1234")); //Expected error message
    }
}
