package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class testcases {
public WebDriver driver;

@BeforeMethod
    public void setup(){

        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
    }







    @Test(description = "Sign Up For Mailing List")
    public void case1() {


driver.findElement(By.cssSelector("[href=\"/sign_up\"]")).click();
  driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("mm");
  driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("mm@gmail.com");
driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
WebElement actual =driver.findElement(By.cssSelector("[name=\"signup_message\"]"));
    System.out.println(actual.getText());
String a=actual.getText();
String b="Thank you for signing up. Click the button below to return to the home page.";
    Assert.assertEquals(a,b);
}
@Test(description = "Verify that number of listed examples")
public void test2() {
    List<WebElement> list = driver.findElements(By.tagName("a"));
    list.remove(0);
    list.remove(list.size()-1);
    System.out.println(list.size());
    for (WebElement links : list
    ) {
        System.out.println(links.getText());
    }
}




@Test(description = "Multiple Buttons")
public void case3(){

    driver.findElement(By.cssSelector("[href=\"/multiple_buttons\"]")).click();
driver.findElement(By.cssSelector("[onclick=\"button1()\"]")).click();
WebElement button=driver.findElement(By.id("result"));
    System.out.println(button.getText());
Assert.assertEquals(button.getText(),"Clicked on button one!");
}
@Test(description = "Registration Form 5")
public void case8(){

driver.findElement(By.cssSelector("[href=\"/registration_form\"]")).click();
driver.findElement(By.cssSelector("[name=\"phone\"]")).sendKeys("5711234354");
String result=driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]")).getText();
    System.out.println(result);
String expected="Phone format is not correct";
Assert.assertEquals(result,expected);

}
@Test(description = "Registration Form")
public void test4(){

driver.findElement(By.linkText("Registration Form")).click();
driver.findElement(By.name("firstname")).sendKeys("123");
WebElement str=driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]"));
    Assert.assertTrue(str.isDisplayed());
    System.out.println(str.getText());
}
@Test(description = "Registration Form 2")
public void test5(){
    driver.findElement(By.linkText("Registration Form")).click();
    driver.findElement(By.name("lastname")).sendKeys("123");
    WebElement str=driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]"));

    Assert.assertEquals(str.getText(),"The last name can only consist of alphabetical letters and dash");
    System.out.println("test is passed");

}
@Test(description = "Registration Form 3")
public void test6(){
    driver.findElement(By.linkText("Registration Form")).click();
    driver.findElement(By.name("username")).sendKeys("user");
    WebElement str=driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]"));
   Assert.assertEquals(str.getText(),"The username must be more than 6 and less than 30 characters long");
    System.out.println("test is passed");
}
@Test(description = "Registration Form 4")
public void test7(){
    driver.findElement(By.linkText("Registration Form")).click();
    driver.findElement(By.name("email")).sendKeys("testers@email");
    String str=driver.findElement(By.cssSelector("[data-bv-validator=\"emailAddress\"]")).getText();
   String str1=driver.findElement(By.cssSelector("[data-bv-validator=\"regexp\"]")).getText();
    String str3=str+str1;
Assert.assertEquals(str3,"email address is not a valid Email format is not correct");
    System.out.println(str1);
}




@AfterMethod
public void closing(){

        driver.quit();
}

}