package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class Home extends Base {


    @FindBy(xpath = "//*[@id=\"ember21\"]/span")
    WebElement home;

    public Home(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void home() throws InterruptedException {
        home.click();

        Thread.sleep(500);

    }
}
