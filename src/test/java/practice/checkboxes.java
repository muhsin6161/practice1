package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class checkboxes {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Checkboxes")).click();
    }

    public void test1(){
    List<WebElement> checkboxes =       driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
    int index = 1;
    for (WebElement checkbox : checkboxes) {
        if(checkbox.isEnabled() && !checkbox.isSelected()){
            checkbox.click();
            System.out.println("Checkbox #"+index+" was clicked");
        }else {
            System.out.println("Checkbox #"+index+" was not clicked");
        }
        index++;
    }


    }






    @AfterMethod
    public void closing() {

        driver.quit();

    }

}
