package pages;

import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Calendereventpage extends LoginPage{
@FindBy(css="[class=\"btn-success btn dropdown-toggle\"]")
    public WebElement SaveandClose;

@FindBy(xpath = "//*[@class=\"pull-right\"]/div/div/div/ul")
public WebElement saveclosetable;



@FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    public void CreateCalendarEvent() {
        BrowserUtils.waitForVisibility(createCalendarEvent, 5);
        BrowserUtils.waitForClickablility(createCalendarEvent, 5);
        createCalendarEvent.click();
    }
public void Save(){
    LoginPage login=new LoginPage();
    login.waitUntilLoaderMaskDisappear();
    SaveandClose.click();
    Assert.assertTrue(saveclosetable.isDisplayed());
    }

public void enter(){
    LoginPage login=new LoginPage();
    login.waitUntilLoaderMaskDisappear();
    login.login("storemanager85","UserUser123");
    login.waitUntilLoaderMaskDisappear();
    login.navigateTo("Activities","Calendar Events");
    login.waitUntilLoaderMaskDisappear();
}





}
