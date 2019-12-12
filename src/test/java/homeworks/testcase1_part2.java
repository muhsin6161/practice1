package homeworks;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase1_part2 {


    public WebDriver driver;
    @BeforeMethod
    public void  setup() {
        driver = BrowserFactory.getDriver("chrome");


    }
@Test
    public void test6(){
     driver.get("https://www.tempmailaddress.com/");
     String email=driver.findElement(By.id("email")).getText();

     driver.get("http://practice.cybertekschool.com/");
driver.findElement(By.linkText("Sign Up For Mailing List")).click();
driver.findElement(By.xpath("//div[@class=\"large-6 small-12 columns\"]/input[@type=\"text\"]")).sendKeys("mmm");
driver.findElement(By.xpath("//div[@class=\"large-6 small-12 columns\"]/input[@type=\"email\"]")).sendKeys(email);
driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
WebElement msg=driver.findElement(By.cssSelector("[name=\"signup_message\"]"));
    System.out.println(msg.isDisplayed());
    System.out.println(msg.getText());
driver.navigate().to("https://www.tempmailaddress.com/");

  String str=driver.findElement(By.xpath("//*[@class=\"odMobil\"][contains(text(),'do-not-reply@practice.cybertekschool.com')]")).getText();
    System.out.println(str);


  driver.findElement(By.xpath("//*[@class=\"odMobil\"][contains(text(),'do-not-reply@practice.cybertekschool.com')]")).click();
String from =driver.findElement(By.cssSelector("[id=\"odesilatel\"]")).getText();
Assert.assertEquals(from,"do-not-reply@practice.cybertekschool.com");
String subject=driver.findElement(By.cssSelector("[id=\"predmet\"]")).getText();
    System.out.println(subject);
Assert.assertEquals(subject,"Thanks for subscribing to practice.cybertekschool.com!");
    }









    @AfterMethod
    public void closing(){

        driver.quit();
    }





}
