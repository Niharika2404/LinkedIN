package com.bridgelabz.selenium.dashboard;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Post extends Base {


    Robot robot = new Robot();

    @FindBy(xpath = "//*[@id=\"ember75\"]/span")
    WebElement Photo;


    public Post(WebDriver driver) throws AWTException {
        PageFactory.initElements(driver, this);
    }

    public void post() throws InterruptedException {

        Photo.click();

        Thread.sleep(1000);
    }

    public void setClipboardData(String string) {

        StringSelection stringselection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
    }

    public void uploadFile(String fileLocation) {
        try {

            setClipboardData("/Users/niharikagarnaik/Desktop");


            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(500);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


        }
        catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}

