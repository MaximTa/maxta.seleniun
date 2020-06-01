package com.geekbrains.maxta.selenium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainAppTests {
    private WebDriver driver;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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
