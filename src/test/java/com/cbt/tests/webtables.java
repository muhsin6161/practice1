package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class webtables {
public WebDriver driver;
@BeforeMethod
public void set(){
    driver= BrowserFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/tables");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test(description = "print table 1")
public void test1(){
    WebElement element=driver.findElement(By.id("table1"));
    System.out.println(element.getText());
}
@Test
public void test2(){

List list= driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
    System.out.println(list.size());
    Assert.assertEquals(list.size(),6);
    System.out.println("passed");
}
@Test
public void test4(){
    WebElement e=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr[2]"));
    System.out.println(e.getText());
}
@Test
public void test5(){

    for(int i=1;i<=6;i++){
   WebElement e=     driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+i+"]"));
        System.out.println(e.getText());
    }


}








@AfterMethod
public void closing(){
    driver.quit();
}


}
