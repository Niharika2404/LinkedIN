package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class Login extends Base {

    @FindBy(id = "username")
    WebElement username;

    @FindBy(name = "session_password")
    WebElement password;

    @FindBy(className = "button__password-visibility")
    WebElement show;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement Sign_in;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }



    public void login() throws InterruptedException {
//        driver.findElement(By.id("username")).sendKeys("niharikagarniak@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("niharikang24");
//        driver.findElement(By.id("password-visibility-toggle")).sendKeys("show");
//        driver.findElement(By.className("btn__primary--large from__button--floating")).sendKeys("Sign in");
            username.sendKeys("niharikagarnaik@gmail.com");
            password.sendKeys("niharikang24");
            show.click();
            Sign_in.click();

        Thread.sleep(500);
    }
}
