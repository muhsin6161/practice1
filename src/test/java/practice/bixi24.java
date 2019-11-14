package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bixi24 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("hr33@cybertekschool.com ");
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-link-text\"]")).click();




    }




}
