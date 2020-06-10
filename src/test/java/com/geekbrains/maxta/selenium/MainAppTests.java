package com.geekbrains.maxta.selenium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainAppTests {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainPage;
    protected SignInPage signInPage;

//hw5-7 in process


    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
        mainPage = new MainPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
    }
    @Test
    public void openPage() {
        driver.get("https://www.automationpractice.com");
    }

    @AfterEach
    public void shutdown() {
        driver.quit();
    }
//hw5
}
