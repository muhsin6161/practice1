package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcasepart3 {

    public WebDriver driver;
    @BeforeMethod
    public void  setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");

    }
@Test
    public void test7(){
    driver.findElement(By.linkText("File Upload")).click();
     driver.findElement(By.id("file-upload")).sendKeys("/Users/mmutlu/Desktop/day49 class note (1).txtx");
driver.findElement(By.id("file-submit")).click();
    WebElement v=driver.findElement(By.cssSelector("[class=\"panel text-center\"]"));
    System.out.println(v.isDisplayed());
    System.out.println("passed");
    }

    @Test
    public void test8(){
       driver.findElement(By.linkText("Autocomplete")).click();
driver.findElement(By.id("myCountry")).sendKeys("United States of America");
driver.findElement(By.cssSelector("[value=\"Submit\"]")).click();
String str=driver.findElement(By.id("result")).getText();
    System.out.println(str);
        Assert.assertEquals(str,"You selected: United States of America");
    }
    @AfterMethod
    public void closing(){

        driver.quit();
    }





}
