package com.epam.atmp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractPage {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
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
        LOGGER.info("Login page opened.");
        return this;
    }

    public MainPage login(String userName, String password) {
        inputLogin.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginButton.click();
        LOGGER.info("Login with userName: [" + userName + "] and password: [" + password +"}]");
        return new MainPage(driver);
    }

}
