package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homework2 {
public WebDriver driver;





@Test
public void test6(){

    driver= BrowserFactory.getDriver("chrome");

    driver.get("https://qa1.vytrack.com/user/login");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.name("_username")).sendKeys("storemanager85");
    driver.findElement(By.name("_password")).sendKeys("UserUser123");
    driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
    WebElement act =driver.findElement(By.xpath("//li[@class=\"dropdown dropdown-level-1\"][4]"));
Actions action=new Actions(driver);
action.moveToElement(act).perform();
driver.findElement(By.linkText("Calendar Events")).click();
driver.findElement(By.xpath("//tr[@class=\"grid-row row-click-action\"][18]")).click();
WebElement str=driver.findElement(By.className("user-name"));
    Assert.assertTrue(str.isDisplayed());
    System.out.println("passed");

driver.quit();

}
}





