package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class f {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver=new FirefoxDriver();
   driver.get("google.com");
    }


}
