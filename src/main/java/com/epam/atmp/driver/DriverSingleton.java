package com.epam.atmp.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class DriverSingleton {

    private static WebDriver driver;

    private static final Logger LOGGER = Logger.getLogger(DriverSingleton.class);

    public static WebDriver getDriver() {
        if (null == driver) {
            switch (System.getProperty("browser").toLowerCase()) {
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    LOGGER.info("Browser Firefox is running.");
                    break;
                }
                case "edge": {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    LOGGER.info("Browser EDGE is running.");
                    break;
                }
                default: {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    LOGGER.info("Browser Chrome is running.");
                    break;
                }
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
        LOGGER.info("Browser closed.");
    }

}
