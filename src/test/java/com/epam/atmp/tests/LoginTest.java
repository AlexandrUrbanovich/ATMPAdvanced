package com.epam.atmp.tests;

import com.epam.atmp.pages.LoginPage;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Listeners({ReportPortalTestNGListener.class})
public class LoginTest extends CommonConditions {
    private static final Logger logger = Logger.getLogger(LoginTest.class);

    @Test(dataProvider = "getUserData", dataProviderClass = DataProviderClass.class)
    public void loginToRP(String userName, String password) throws InterruptedException {
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(userName, password)
                .getDefaultLoggedUser();
        assertTrue(loggedInUserName.equals(userName.toUpperCase()));

    }
}
