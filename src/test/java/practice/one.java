package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class one {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
      driver.get("https://qa2.vytrack.com/user/login");
driver.findElement(By.xpath("//input[@id=\"prependedInput\"]")).sendKeys("muhsin@hotmail.com");
driver.findElement(By.id("prependedInput2")).sendKeys("123");
driver.findElement(By.xpath("//button[@name=\"_submit\"]")).click();



WebElement invalid=driver.findElement(By.xpath("//div[@ class=\"alert alert-error\"]"));
        System.out.println(invalid.getText());

    Thread.sleep(3);

    }








}
