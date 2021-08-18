package com.epam.atmp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//div[@id='app']/div['dl']")
    private WebElement dlButton;

    @FindBy(xpath = "//*[@id='app']//span[contains(text(), 'Dashboards')]")
    private WebElement dashboardsButton;

    @FindBy(xpath = "//*[@id='app']//span[contains(text(), 'Launches')]")
    private WebElement launchesButton;

    @FindBy(xpath = "//*[@id='app']//span[contains(text(), 'Filters')]")
    private WebElement filtersButton;

    @FindBy(xpath = "//*[@id='app']//span[contains(text(), 'Debug')]")
    private WebElement debugButton;

    @FindBy(xpath = "//*[@id='app']//span[contains(text(), 'Project members')]")
    private WebElement projectMembersButton;

    @FindBy(xpath = "//*[@id='app']//span[contains(text(), 'Project settings')]")
    private WebElement projectSettingsButton;

    @FindBy(xpath = "//img[@alt='avatar']")
    private WebElement profileButton;

    @FindBy(xpath = "//*[@id='app']//div[@class='userBlock__username--2nzpE']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='notification-root']/div/div/div/div")
    private WebElement popupMessage;

    protected AbstractPage openPage() {
        return null;
    }

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getDefaultLoggedUser() throws InterruptedException {
        if (popupMessage.isDisplayed()) {
            popupMessage.click();
        }

        profileButton.click();
        return userName.getText();
    }

}
