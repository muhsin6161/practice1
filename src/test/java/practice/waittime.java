package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class waittime {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
          driver = BrowserFactory.getDriver("chrome");
     driver.get("http://practice.cybertekschool.com/");
    }
    @Test(description = "Implicit wait example")
    public void test1() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Dynamic Loading")).click();

        driver.findElement(By.partialLinkText("Example 2")).click();
        driver.findElement(By.tagName("button")).click();
        //this is for "Hello World!"
        WebElement finishElement = driver.findElement(By.id("finish"));
        System.out.println(finishElement.getText());
    }
@Test(description = "explicit wait time ")
    public void test2() throws InterruptedException {
    driver.findElement(By.linkText("Dynamic Loading")).click();
    driver.findElement(By.partialLinkText("Example 1")).click();
driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
WebElement user=driver.findElement(By.id("username"));
    WebDriverWait wait=new WebDriverWait(driver,10)
wait.until(ExpectedConditions.visibilityOf(user));
   Thread.sleep(2);
    }
@AfterMethod
public void closing(){
        driver.quit();
}

}
