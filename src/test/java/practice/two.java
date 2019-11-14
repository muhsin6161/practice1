package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class two {
    public static void main(String[] args) throws InterruptedException {
        String names []={"User45","User46","User47","storemanager79","storemanager80","storemanager247",
                "salesmanager143","salesmanager144","salesmanager145"};
        String pass="UserUser123";

for(int i=0;i<1;i++){
    WebDriver driver= BrowserFactory.getDriver("chrome");

    driver.get("https://qa2.vytrack.com/user/login");
    driver.findElement(By.xpath("//input[@id=\"prependedInput\"]")).sendKeys(names[0]);
    driver.findElement(By.id("prependedInput2")).sendKeys(pass);
    driver.findElement(By.xpath("//button[@name=\"_submit\"]")).click();
   Thread.sleep(3);



}





    }



}
