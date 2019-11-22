package com.cbt.tests;


import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class mm {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com");


    }


}
