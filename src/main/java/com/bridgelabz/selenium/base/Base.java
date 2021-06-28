package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static java.lang.Thread.sleep;

public class Base {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login");
        driver.manage().window().maximize();
        Thread.sleep(500);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
