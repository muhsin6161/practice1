package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class popup {
private WebDriver driver;
@BeforeMethod
public void setup(){
    driver= BrowserFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/");
}
@Test
public void pupup1() throws InterruptedException {
    driver.findElement(By.linkText("JavaScript Alerts")).click();
driver.findElement(By.cssSelector("[onclick=\"jsAlert()\"]")).click();
    Alert alert=driver.switchTo().alert();
    Thread.sleep(1000);

    alert.dismiss();



}
    @Test
public void popup2() throws InterruptedException {
        driver.findElement(By.linkText("JavaScript Alerts")).click();
    driver.findElement(By.xpath("//button[2]")).click();
   Alert alert=driver.switchTo().alert();
   Thread.sleep(1000);
   alert.dismiss();



}
    @Test
public void pop3() throws InterruptedException {
        driver.findElement(By.linkText("JavaScript Alerts")).click();
   driver.findElement(By.xpath("//button[3]")).click();
        Thread.sleep(3000);

   driver.switchTo().alert().sendKeys("mmmmmmmm");
Thread.sleep(3000);
    driver.switchTo().alert().accept();



}

}
