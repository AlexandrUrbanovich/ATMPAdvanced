package com.epam.atmp.tests;

import com.epam.atmp.service.UserCreator;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name="getUserData")
    public Object[][] getUserData() {
        Object[][] data = new Object[2][2];
        data[0][0] = UserCreator.defaultUser().getUsername();
        data[0][1] = UserCreator.defaultUser().getPassword();
        data[1][0] = UserCreator.adminUser().getPassword();
        data[1][1] = UserCreator.adminUser().getPassword();
        return data;
    }
}
