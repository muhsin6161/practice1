package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver=BrowserFactory.getDriver("chrome");
      String actual="";
String expected="Practice";
        for(int i=0;i<urls.size();i++) {
            driver.get(urls.get(i));
            driver.getTitle();
            actual = driver.getTitle();
            StringUtility.verifyEquals(actual, expected);

        }




    }






}
