package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class homework {
public WebDriver driver;

 @BeforeMethod
 public void set(){
    driver= BrowserFactory.getDriver("chrome");
    driver.get("https://qa1.vytrack.com/user/login");
driver.findElement(By.name("_username")).sendKeys("storemanager81");
driver.findElement(By.name("_password")).sendKeys("UserUser123");
    driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
 }
@Test
    public void test1() throws InterruptedException {
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     WebElement act =driver.findElement(By.xpath("//li[@class=\"dropdown dropdown-level-1\"][4]"));
    Actions action=new Actions(driver);
    action.moveToElement(act).perform();
driver.findElement(By.linkText("Calendar Events")).click();
WebElement opt=driver.findElement(By.cssSelector("[class=\"btn btn-link dropdown-toggle\"]"));
        System.out.println(opt.isDisplayed());
        System.out.println("passed");
 Thread.sleep(3000);

 }
@Test
 public void test2(){
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement act =driver.findElement(By.xpath("//li[@class=\"dropdown dropdown-level-1\"][4]"));
    Actions action=new Actions(driver);
    action.moveToElement(act).perform();
    driver.findElement(By.linkText("Calendar Events")).click();
    WebElement num=driver.findElement(By.cssSelector("[value=\"1\"]:nth-of-type(1)"));
String str=num.getAttribute("value");
    System.out.println(str);
Assert.assertEquals(str,"1");
 }
@Test
   public void test3(){
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement act =driver.findElement(By.xpath("//li[@class=\"dropdown dropdown-level-1\"][4]"));
       Actions action=new Actions(driver);
       action.moveToElement(act).perform();
       driver.findElement(By.linkText("Calendar Events")).click();
   WebElement num=driver.findElement(By.cssSelector("[class=\"btn dropdown-toggle \"]"));
       System.out.println(num.getText());
    Assert.assertEquals(num.getText(),"25");
    System.out.println("passed");
 }
@Test
public void test4(){
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement act =driver.findElement(By.xpath("//li[@class=\"dropdown dropdown-level-1\"][4]"));
    Actions action=new Actions(driver);
    action.moveToElement(act).perform();
    driver.findElement(By.linkText("Calendar Events")).click();
    List list=driver.findElements(By.xpath("//tr[@class=\"grid-row row-click-action\"]"));
    System.out.println(list.size());
    WebElement num=driver.findElement(By.cssSelector("[value=\"1\"]:nth-of-type(1)"));
    String str=num.getAttribute("value");
Assert.assertEquals(str,""+list.size());

}
@Test
public void test5(){
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement act =driver.findElement(By.xpath("//li[@class=\"dropdown dropdown-level-1\"][4]"));
    Actions action=new Actions(driver);
    action.moveToElement(act).perform();
    driver.findElement(By.linkText("Calendar Events")).click();
 WebElement slc=   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[1]/div/button/input"));
   slc.click();
 Assert.assertTrue(slc.isSelected());
    System.out.println("passed");
 }






}
