package com.epam.atmp.tests;

import com.epam.atmp.model.User;
import com.epam.atmp.service.UserCreator;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ReportPortalTestNGListener.class})
public class LoginTest extends CommonConditions {
    private static final Logger logger = Logger.getLogger(CommonConditions.class);

    @Test
    public void loginToRP() {
        //TODO
        User testUser = UserCreator.defaultUser();

    }
}
