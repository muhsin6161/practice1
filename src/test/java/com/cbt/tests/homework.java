package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class homework {

    public WebDriver driver;

    @BeforeMethod
    public void set() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/");
        driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("storemanager85");
        driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("UserUser123");
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement activities = driver.findElement(By.xpath("//*[@class=\"nav-multilevel main-menu\"]/li[5]"));

        Actions action = new Actions(driver);
        action.moveToElement(activities).perform();
        driver.findElement(By.linkText("Calendar Events")).click();
    }

    @Test
    public void test1() {

        WebElement dots = driver.findElement(By.xpath("//*[@class=\"grid-body\"]/tr[15]/td[9]"));
        Actions action = new Actions(driver);
        action.moveToElement(dots).perform();
        System.out.println(dots.isDisplayed());
        System.out.println("passed");


    }
@Test
    public void teste2(){

    WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
    WebDriverWait wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.invisibilityOf(a));

    driver.findElement(By.cssSelector("[class=\"fa-cog hide-text\"]")).click();
List<WebElement> list=driver.findElements(By.cssSelector("[data-role=\"renderable\"]"));
    for(int i =1;i<list.size();i++){
      list.get(i).click();
    }
WebElement clm=driver.findElement(By.cssSelector("[class=\"renderable\"]"));
    Assert.assertTrue(clm.isDisplayed());
    }
    @Test
    public void test3() {

        WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOf(a));
        driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();
        WebElement a1 = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait waits = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOf(a1));
        driver.findElement(By.cssSelector("[class=\"btn-success btn dropdown-toggle\"]")).click();
        WebElement SaveandClose = driver.findElement(By.cssSelector("[class=\"action-button dropdown-item\"]"));
        System.out.println(SaveandClose.isDisplayed());
        WebElement SaveandNew = driver.findElement(By.xpath("//*[contains(text(),'New')]"));
        System.out.println(SaveandNew.isDisplayed());
        WebElement Save = driver.findElement(By.xpath("//div[@class=\"btn-group pull-right open\"]/ul/li[3]"));
        System.out.println(Save.isDisplayed());
    }

    @Test
    public void test4() {
        WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOf(a));
        driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();
        WebElement a1 = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait waits = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.invisibilityOf(a1));
        driver.findElement(By.cssSelector("[title=\"Cancel\"]")).click();
        WebElement all = driver.findElement(By.cssSelector("[class=\"oro-subtitle\"]"));
        System.out.println(all.isDisplayed());
    }

    @Test
    public void test5() {
        WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(a));
        driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

        WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
        wait.until(ExpectedConditions.invisibilityOf(mask));
        WebElement startTime = driver.findElement(By.cssSelector("[class='input-small timepicker-input start ui-timepicker-input']"));
        System.out.println(startTime.getAttribute("value"));
        WebElement endTime = driver.findElement(By.cssSelector("[class=\"input-small timepicker-input end ui-timepicker-input\"]"));
        System.out.println(endTime.getAttribute("value"));


    }

    @Test
    public void test6() {

        WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(a));
        driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

        WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
        wait.until(ExpectedConditions.invisibilityOf(mask));

        WebElement startTime1 = driver.findElement(By.cssSelector("[class='input-small timepicker-input start ui-timepicker-input']"));
        startTime1.click();
        WebElement startTime = driver.findElement(By.xpath("//*[contains(text(),'9:00 PM')]"));
        startTime.click();
        WebElement endTime = driver.findElement(By.cssSelector("[class=\"input-small timepicker-input end ui-timepicker-input\"]"));
        System.out.println(endTime.getAttribute("value"));


    }

    @Test
    public void test7() {

        WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(a));
        driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

        WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
        wait.until(ExpectedConditions.invisibilityOf(mask));
        WebElement all = driver.findElement(By.cssSelector("[name=\"oro_calendar_event_form[allDay]\"]"));
        all.click();
        WebElement startTime1 = driver.findElement(By.cssSelector("[class='input-small timepicker-input start ui-timepicker-input']"));
        WebElement endTime = driver.findElement(By.cssSelector("[class=\"input-small timepicker-input end ui-timepicker-input\"]"));

        Assert.assertFalse(startTime1.isDisplayed());
        Assert.assertFalse(endTime.isDisplayed());
    }

    @Test
    public void test8() {

        WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(a));
        driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

        WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
        wait.until(ExpectedConditions.invisibilityOf(mask));

        WebElement repeat = driver.findElement(By.cssSelector("[data-name=\"recurrence-repeat\"]"));
        repeat.click();
        Assert.assertTrue(repeat.isSelected());

        WebElement def = driver.findElement(By.cssSelector("[class=\"recurrence-repeats__select\"]"));
        System.out.println(def.getAttribute("value"));

Select select=new Select(def);
      List<WebElement> opt=select.getOptions();
      for(WebElement each:opt){
          System.out.println(each.isDisplayed());
      }
    }
@Test
public void test9(){

    WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.invisibilityOf(a));
    driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

    WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
    wait.until(ExpectedConditions.invisibilityOf(mask));

    WebElement repeat = driver.findElement(By.cssSelector("[data-name=\"recurrence-repeat\"]"));
    repeat.click();
    Assert.assertTrue(repeat.isSelected());

    WebElement def = driver.findElement(By.cssSelector("[class=\"recurrence-repeats__select\"]"));
def.click();

WebElement check=driver.findElement(By.cssSelector("[checked=\"checked\"]"));
Assert.assertTrue(check.isSelected());
    System.out.println("passed");
WebElement never=driver.findElement(By.xpath("//*[@checked]"));

Assert.assertTrue(never.isSelected());
WebElement m=driver.findElement(By.cssSelector("[class=\"control-group recurrence-summary alert-info\"]"));
    System.out.println(m.getText());
Assert.assertEquals(m.getText(),"Summary:\n" +
        "Daily every 1 day");




    }

    @Test
    public void test10(){
    WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.invisibilityOf(a));
    driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

    WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
    wait.until(ExpectedConditions.invisibilityOf(mask));

    WebElement repeat = driver.findElement(By.cssSelector("[data-name=\"recurrence-repeat\"]"));
    repeat.click();
WebElement occ=driver.findElement(By.cssSelector("[data-related-field=\"occurrences\"]"));
occ.click();
occ.sendKeys("10");
    WebElement txt=driver.findElement(By.cssSelector("[class=\"control-group recurrence-summary alert-info\"]"));
        System.out.println(txt.getText());
    Assert.assertEquals(txt.getText(),"Summary:\n" +
            "Daily every 1 day");
    }
@Test
    public void test11(){
    WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.invisibilityOf(a));
    driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

    WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
    wait.until(ExpectedConditions.invisibilityOf(mask));

    WebElement repeat = driver.findElement(By.cssSelector("[data-name=\"recurrence-repeat\"]"));
    repeat.click();
WebElement byby=driver.findElement(By.xpath("//*[@class=\"recurrence-subview-control__item recurrence-subview-control__item-datetime\"]//label//input"));
byby.click();
driver.findElement(By.cssSelector("[class=\"datepicker-input hasDatepicker\"]")).click();
    WebElement year=driver.findElement(By.cssSelector("[data-handler=\"selectYear\"]"));
   Select select=new Select(year);
    select.selectByValue("2021");

driver.findElement(By.xpath("//tbody//tr[3]//td[5]")).click();
    WebElement txt=driver.findElement(By.cssSelector("[class=\"control-group recurrence-summary alert-info\"]"));
    System.out.println(txt.getText());
    Assert.assertEquals(txt.getText(),"Summary:\n" +
            "Daily every 1 day, end by Nov 18, 2021");
    }
@Test
    public void test12(){

    WebElement a = driver.findElement(By.cssSelector("[class=\"loader-mask shown\"]"));
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.invisibilityOf(a));
    driver.findElement(By.cssSelector("[title=\"Create Calendar event\"]")).click();

    WebElement mask = driver.findElement(By.cssSelector("[class='loader-mask shown']"));
    wait.until(ExpectedConditions.invisibilityOf(mask));

    WebElement repeat = driver.findElement(By.cssSelector("[data-name=\"recurrence-repeat\"]"));
    repeat.click();


    WebElement def = driver.findElement(By.cssSelector("[class=\"recurrence-repeats__select\"]"));
    System.out.println(def.getAttribute("value"));

    Select select=new Select(def);
select.selectByValue("weekly");
 WebElement c=   driver.findElement(By.xpath("//*[@class=\"multi-checkbox-control\"]//label[2]"));
  WebElement b=  driver.findElement(By.xpath("//*[@class=\"multi-checkbox-control\"]//label[6]"));
    c.click();
    b.click();
    System.out.println(c.isSelected());
    System.out.println(b.isSelected());
    WebElement txt=driver.findElement(By.cssSelector("[class=\"control-group recurrence-summary alert-info\"]"));
    System.out.println(txt.getText());
   Assert.assertEquals(txt.getText(),"Summary:\n" +
           "Weekly every 1 week on Monday, Friday");
    }



    @AfterMethod
    public void closing() throws InterruptedException {

       Thread.sleep(3000);
        driver.quit();
    }

}