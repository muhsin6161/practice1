package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class testcases {
@Test
    public void case1() {

        WebDriver driver = BrowserFactory.getDriver("chrome");
driver.get("https://practice-cybertekschool.herokuapp.com/");
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

@Test
public void case3(){
    WebDriver driver=BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com/");
    driver.findElement(By.cssSelector("[href=\"/multiple_buttons\"]")).click();
driver.findElement(By.cssSelector("[onclick=\"button1()\"]")).click();
WebElement button=driver.findElement(By.id("result"));
    System.out.println(button.getText());
Assert.assertEquals(button.getText(),"Clicked on button one!");
}
@Test
public void case4(){
    WebDriver driver=BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com/");
driver.findElement(By.cssSelector("[href=\"/registration_form\"]")).click();
driver.findElement(By.cssSelector("[name=\"phone\"]")).sendKeys("5711234354");
String result=driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]")).getText();
    System.out.println(result);
String expected="Phone format is not correct";
Assert.assertEquals(result,expected);

}






}