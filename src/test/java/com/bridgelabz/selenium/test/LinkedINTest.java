package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.Home;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.SearchBar;
import org.testng.annotations.Test;

public class LinkedINTest extends Base {

    @Test
    public void sign_Application() throws InterruptedException {


        Login login = new Login(driver);
        login.login();



//        Home home = new Home(driver);
//        home.home();


    }
    @Test
    public void search_Application() throws InterruptedException {


        Login login = new Login(driver);
        login.login();

        SearchBar searchbutton = new SearchBar();
        searchbutton.searchbar();

    }
}
