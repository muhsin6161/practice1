package com.cbt.tests;

import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.Driver;
import com.cbt.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.cbt.utilities.ConfigurationReader;
import pages.LoginPage;

public class LoginTest  extends TestBase {
     @Ignore
    @Test
    public void test1() {
        //read url value from the properties file
        String url = ConfigurationReader.getProperty("url");
        //Driver.get() --> will return webdriver object
        //and then we can call webdriver methods like get(), findElement()....
//        WebDriver driver = Driver.get();
        Driver.get().get(url);
        //print page title
        System.out.println(Driver.get().getTitle());
        BrowserUtils.wait(2);
        Driver.close();


    }
@Test
    public void test2(){
        System.out.println(   Driver.get().getTitle());
BrowserUtils.wait(2);
     }
@Test(description = "verify that page title is 'Dashbord'")
     public void test3(){
         LoginPage login=new LoginPage();
         login.login("storemanager85","UserUser123");
    WebDriverWait wait=new WebDriverWait(Driver.get(),10);
    wait.until(ExpectedConditions.titleIs("Dashboard"));
         Assert.assertEquals(Driver.get().getTitle(),"Dashboard");
     }
public void tesetb24(){

}



}