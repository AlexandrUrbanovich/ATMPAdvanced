package com.epam.atmp.tests.junit;

import com.epam.atmp.driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class CommonConditions {

    protected WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterEach
    void stopBrowser() {
        DriverSingleton.closeDriver();
    }
}
