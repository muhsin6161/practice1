package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdown {
    private WebDriver driver;

    //   <select id="dropdown">
//      <option value="" disabled="disabled" selected="selected">Please select an option</option>
//      <option value="1">Option 1</option>
//      <option value="2">Option 2</option>
//    </select>
    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Dropdown")).click();}
@Test
public void test(){
    WebElement Birth=driver.findElement(By.cssSelector("[id=\"year\"]"));
    Select s=new Select(Birth);
    s.selectByValue("1984");
    Assert.assertEquals(s.getFirstSelectedOption().getText(),"1984");

    }





}
