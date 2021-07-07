package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobs extends Base {


    @FindBy(xpath = "//*[@id=\"ember25\"]")
    WebElement Jobs;

    @FindBy(xpath = "//*[@id=\"jobs-search-box-keyword-id-ember2608\"]")
    WebElement Search_by_title_skill_or_company;


    public Jobs(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void jobs() {
        Jobs.click();

        Search_by_title_skill_or_company.sendKeys("Software Engineer");
    }
}