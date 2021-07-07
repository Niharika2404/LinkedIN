package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    @FindBy (xpath = "//input[@id='username']")
    WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"organic-div\"]/form/div[3]/button")
    WebElement Sign_in;

//    @FindBy(className = "btn__primary--large")
//    WebElement Remember;
//
//    @FindBy(className = "btn__secondary--large-muted")
//    WebElement Not_now;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void login() throws InterruptedException {

            username.sendKeys("niharikang24@gmail.com");
            password.sendKeys("niharikang24");
            Sign_in.click();
//            Remember.click();
//            Not_now.click();

        Thread.sleep(5000);


    }
}
