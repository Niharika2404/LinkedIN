package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.dashboard.SearchBar;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.dashboard.Post;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class LinkedINTest extends Base {

    @Test
    public void sign_Application() throws InterruptedException {

        Login login = new Login(driver);
        login.login();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.linkedin.com/login";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void search_Application() throws InterruptedException {

        Login login = new Login(driver);
        login.login();

        SearchBar search = new SearchBar(driver);
        search.searchbar();


        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.linkedin.com/search/results/all/?keywords=BridgeLabz&origin=HISTORY";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void post_Photo() throws InterruptedException, AWTException {

        Login login = new Login(driver);
        login.login();

        Post post = new Post(driver);
        post.post();

        Post uploadFile = new Post(driver);
        uploadFile.uploadFile("/Users/niharikagarnaik/Desktop");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.linkedin.com/feed/";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl);

    }


}
