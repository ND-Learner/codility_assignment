package Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class TakeScreenshot {

    public static void takeScreenShot(WebDriver driver, String pagename)
    {
        try {
            File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(("./Demo."+"screenshot" + ".png"));
            FileUtils.copyFile(scr, dest);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
