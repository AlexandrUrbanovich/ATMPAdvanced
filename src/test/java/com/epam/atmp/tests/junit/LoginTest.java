package com.epam.atmp.tests.junit;

import com.epam.atmp.pages.LoginPage;
import com.epam.atmp.service.UserCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest  extends CommonConditions {

    @Test
    void loginAsDefault() {
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(UserCreator.defaultUser().getUsername(), UserCreator.defaultUser().getPassword())
                .getDefaultLoggedUser();
        Assertions.assertTrue(loggedInUserName.equals(UserCreator.defaultUser().getUsername().toUpperCase()));
    }

    @Test
    void loginAsAdmin() {
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(UserCreator.adminUser().getUsername(), UserCreator.adminUser().getPassword())
                .getDefaultLoggedUser();
        Assertions.assertTrue(loggedInUserName.equals(UserCreator.adminUser().getUsername().toUpperCase()));
    }


}
