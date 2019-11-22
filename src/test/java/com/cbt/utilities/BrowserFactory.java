package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }

    public static WebDriver getDriver(String str) {
        String os = System.getProperty("os.name");
        if (os.equalsIgnoreCase("Mac OS X") && str.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (os.equalsIgnoreCase("Mac OS X") && str.equalsIgnoreCase("fire")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        return null;


    }

public static WebDriver Practice(){
    WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://practice-cybertekschool.herokuapp.com/");


    return null;
    }




}




