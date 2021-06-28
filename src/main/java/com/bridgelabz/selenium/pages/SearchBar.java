package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static java.lang.Thread.sleep;

public class SearchBar extends Base {

    @FindBy(xpath = "//input[@role='combobox']")
    WebElement search;

    public SearchBar(driver) {
        PageFactory.initElements(driver,this);
    }

    public void searchbar() throws InterruptedException {


        Actions actions = new Actions(driver);
        actions.sendKeys(search,"BridgeLabz").build().perform();
       actions.sendKeys(Keys.ENTER).perform();

        sleep(5000);

        search.click();
    }
}
