package homeworks;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase1 {

    public WebDriver driver;
@BeforeMethod
public void  setup(){
    driver= BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com/");
    driver.findElement(By.linkText("Registration Form")).click();
}
@Test
public void test1() {
    driver.findElement(By.name("birthday")).sendKeys("wrongdob");
    String actual = driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]")).getText();
    String expected = "The date of birth is not valid";
    Assert.assertEquals(actual, expected);
    System.out.println("test passed");
}
@Test
public void test2(){
WebElement c=driver.findElement(By.xpath("//*[starts-with(text(),'C+')]"));
WebElement java=driver.findElement(By.xpath("//*[starts-with(@for,'inlineCheckbox2')]"));
WebElement javas=driver.findElement(By.xpath("//*[starts-with(@for,'inlineCheckbox3')]"));
    System.out.println(c.isDisplayed());
    System.out.println(java.isDisplayed());
    System.out.println(javas.isDisplayed());
}
@Test
public void test3(){
    driver.findElement(By.name("firstname")).sendKeys("a");
String actual=   driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]")).getText();
String expected="first name must be more than 2 and less than 64 characters long";
Assert.assertEquals(actual,expected);
    System.out.println("test passed");
}
@Test
public void  test4(){
    driver.findElement(By.name("lastname")).sendKeys("a");
String actual=    driver.findElement(By.xpath("//small[contains(text(),'The last name must be more than 2 and less than 64 characters long')]")).getText();
String expected="The last name must be more than 2 and less than 64 characters long";
Assert.assertEquals(actual,expected);

    System.out.println("test passed");
}
@Test
public void test5(){
    driver.findElement(By.name("firstname")).sendKeys("lionel");
    driver.findElement(By.name("lastname")).sendKeys("messi");
driver.findElement(By.cssSelector("[placeholder=\"username\"]")).sendKeys("messii");
driver.findElement(By.cssSelector("[data-bv-field=\"password\"]")).sendKeys("12345678");
driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("mmm@hotmail.com");
driver.findElement(By.cssSelector("[name=\"phone\"]")).sendKeys("517-000-0000");
driver.findElement(By.cssSelector("[value=\"male\"]")).click();
driver.findElement(By.name("birthday")).sendKeys("04/04/2004");
WebElement department=driver.findElement(By.cssSelector("[name=\"department\"]"));
    Select select=new Select(department);
select.selectByValue("DE");
WebElement job=driver.findElement(By.cssSelector("[name=\"job_title\"]"));
Select title=new Select(job);
title.selectByVisibleText("SDET");
    driver.findElement(By.xpath("//*[starts-with(@for,'inlineCheckbox2')]")).click();
driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
WebElement alert=driver.findElement(By.cssSelector("[class=\"alert alert-success\"]>p"));
    System.out.println(alert.isDisplayed());

}









    @AfterMethod
    public void closing(){

        driver.quit();
    }



}
