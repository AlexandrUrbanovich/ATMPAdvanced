package com.epam.atmp.tests.testNG;

import com.epam.atmp.service.UserCreator;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name="getUserData")
    public Object[][] getUserData() {

        return  new Object[][] {
                {UserCreator.defaultUser().getUsername(), UserCreator.defaultUser().getPassword()},
                {UserCreator.adminUser().getUsername(), UserCreator.adminUser().getPassword()}
        };
    }
}
