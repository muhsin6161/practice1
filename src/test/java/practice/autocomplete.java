package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        String nn=driver.getTitle();
        System.out.println(nn);
        driver.findElement(By.xpath("//a[@href=\"/autocomplete\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"myCountry\"]")).sendKeys("amerika");
driver.findElement(By.xpath("//input[@type=\"button\"]")).click();

        WebElement mm=driver.findElement(By.xpath("//*[starts-with(@style,'color')]"));
        System.out.println(mm.getText());
        Thread.sleep(3);

        driver.findElement(By.xpath("//a[@class=\"nav-link\"]")).click();

driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]")).click();
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("muhsin");
driver.findElement(By.id("form_submit")).submit();
    }


}
