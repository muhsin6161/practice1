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

public class radiobutton {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Radio Buttons")).click();
    }

    @Test
    public void test() {

        WebElement button = driver.findElement(By.cssSelector("[id=\"blue\"]"));
        Assert.assertTrue(button.isSelected());
        System.out.println("is selected");
    }

    @Test(description = "red button is not selected")
    public void test1() {
        WebElement button = driver.findElement(By.cssSelector("[id=\"red\"]"));
        Assert.assertFalse(button.isSelected());
        System.out.println("true");
    }
@Test(description = "green is not clickable")
public void test2(){
        WebElement button=driver.findElement(By.cssSelector("[id=\"green\"]"));
Assert.assertFalse(button.isEnabled());
    System.out.println("true");

}
@Test(description = "all buutons")
public void test3() throws InterruptedException {

    List<WebElement> list=driver.findElements(By.cssSelector("input[type=\"radio\"]"));
for (WebElement button:list){
    if(button.isEnabled() && !button.isSelected()){
        button.click();
        System.out.println("true"+button.getAttribute("id"));

    }
else{
        System.out.println("not true"+button.getAttribute("id"));

}

    Thread.sleep(1000);
}
}




    @AfterMethod
    public void closing() {

        driver.quit();

    }
}


