package com.epam.atmp.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractPage {

    private final Logger logger = LogManager.getRootLogger();
    private static final String PAGE_URL = "http://localhost:8080/ui/#login";

    @FindBy(xpath = "//a[@href='http://reportportal.io/']")
    private WebElement linkText;

    @FindBy(xpath = "//input[@placeholder='Login']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button['Login']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LoginPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened.");
        return this;
    }

    public MainPage login(String userName, String password) {
        inputLogin.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();
        logger.info("Login with userName: [{}] and password: [{}}]", userName, password);
        return new MainPage(driver);
    }

}
