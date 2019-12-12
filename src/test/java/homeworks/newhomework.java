package homeworks;


import com.cbt.utilities.Driver;

import com.cbt.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.testng.annotations.Test;
import pages.Calendereventpage;
import pages.LoginPage;

import java.util.List;

public class newhomework extends TestBase {
    @Test(description = "hover on three dots")
    public void testcae1() {
        Calendereventpage cld = new Calendereventpage();
       cld.waitUntilLoaderMaskDisappear();
        cld.enter();
        WebElement dots = Driver.get().findElement(By.xpath("//tbody/tr[16]/td[9]"));
        cld.waitUntilLoaderMaskDisappear();
        Actions action = new Actions(Driver.get());
        action.moveToElement(dots).perform();

        List<WebElement> edit = Driver.get().findElements(By.xpath("//tbody/tr[16]/td[9]/div/div/ul/li/ul/li"));
        for (WebElement each : edit) {
            System.out.println(each.isDisplayed());
        }
    }
    @Test
    public void test2() {
        Calendereventpage cld = new Calendereventpage();
        cld.enter();
        WebElement opt = Driver.get().findElement(By.cssSelector("[class=\"fa-cog hide-text\"]"));
        opt.click();
        List<WebElement> list = Driver.get().findElements(By.cssSelector("[data-role=\"renderable\"]"));
        for (int i = 1; i < list.size(); i++) {
            list.get(i).click();
        }
        WebElement clm = Driver.get().findElement(By.cssSelector("[class=\"renderable\"]"));
        Assert.assertTrue(clm.isDisplayed());
    }

    @Test
    public void test3() {
        Calendereventpage cld = new Calendereventpage();
        cld.enter();
        cld.CreateCalendarEvent();
        cld.Save();

    }
@Test
    public void test4(){
    Calendereventpage cld = new Calendereventpage();
    cld.enter();
    cld.CreateCalendarEvent();
cld.waitUntilLoaderMaskDisappear();
    Driver.get().findElement(By.cssSelector("[title=\"Cancel\"]")).click();
    cld.waitUntilLoaderMaskDisappear();

    Assert.assertEquals(cld.getPageSubTitle(),"All Calendar Events");
    }
@Test
    public void test5(){
    Calendereventpage cld = new Calendereventpage();
    cld.enter();
    cld.CreateCalendarEvent();
    cld.waitUntilLoaderMaskDisappear();
WebElement start=Driver.get().findElement(By.cssSelector("[class=\"input-small timepicker-input start ui-timepicker-input\"]"));
    System.out.println(start.getAttribute("value"));
    WebElement endTime = Driver.get().findElement(By.cssSelector("[class=\"input-small timepicker-input end ui-timepicker-input\"]"));
    System.out.println(endTime.getAttribute("value"));
    }



}

