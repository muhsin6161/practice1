package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class kk {
    public static void main(String[] args) {


        WebDriver driver= BrowserFactory.getDriver("Chrome");
    driver.get(" https://cybertekschool.com/");
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        for (WebElement links:list
             ) {
            System.out.println(links.getText());

        }

    }


}
