package com.bridgelabz.selenium.dashboard;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBar extends Base {

    @FindBy(xpath = "//*[@id=\"ember19\"]/input")
    WebElement search;

    public SearchBar(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void searchbar() throws InterruptedException {


        Actions actions = new Actions(driver);
        actions.sendKeys(search,"BridgeLabz").build().perform();

//        search.sendKeys("BridgeLabz");
        actions.sendKeys(Keys.ENTER).perform();

//        search.click();

        Thread.sleep(5000);


    }
}
