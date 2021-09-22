package com.epam.atmp.tests.testNG;

import com.epam.atmp.pages.LoginPage;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners({ReportPortalTestNGListener.class})
public class LoginTest extends CommonConditions {

    @Test(dataProvider = "getUserData", dataProviderClass = DataProviderClass.class,
            description = "Verify regular user and admin user are able to sign-in ")
    public void loginToRP(String userName, String password) {
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(userName, password)
                .getDefaultLoggedUser();
        assertTrue(loggedInUserName.equals(userName.toUpperCase()));

    }
}
