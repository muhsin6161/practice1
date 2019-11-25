package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frame {
public WebDriver driver;

@BeforeMethod
public void setup(){
    driver= BrowserFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/frames");

}

@Test
public void frame(){

driver.findElement(By.linkText("iFrame")).click();
driver.switchTo().frame("mce_0_ifr");
    WebElement inputArea = driver.findElement(By.id("tinymce"));
    inputArea.clear();
    inputArea.sendKeys("muhsin mutlu");
driver.switchTo().defaultContent();


}
public void test2(){

    driver.findElement(By.linkText("Nested Frames")).click();
driver.switchTo().frame("frame-bottom");
    WebElement content = driver.findElement(By.tagName("body"));

}

}
