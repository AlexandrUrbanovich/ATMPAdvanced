package com.epam.atmp.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "http://localhost:8080/ui/#login";

    @FindBy(xpath = "//a[@href='http://reportportal.io/']")
    private WebElement linkText;

    @FindBy(xpath = "//input[@placeholder='Login']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement inputPassword;

    protected LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    protected AbstractPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened.");
        return this;
    }
}
