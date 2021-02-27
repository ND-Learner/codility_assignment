package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ElementWait {

    public static void wait_for_page(WebDriver driver, WebElement element){

        try {
            System.out.println("Waiting for the page to load");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
