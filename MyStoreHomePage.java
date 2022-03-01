package JourneyPages;

import Utility.ElementWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStoreHomePage {
   WebDriver driver;

    public MyStoreHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@class='login']")
    WebElement signInButton;

  //  @FindBy(xpath = "//a[text()='T-shirts']")
    @FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=5&controller=category']")
    WebElement tshirt_tab;

    public void view_tshirts(){
       // ElementWait.wait_for_page(driver, tshirt_tab);
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(tshirt_tab));
        wait.until(ExpectedConditions.elementToBeClickable(tshirt_tab));*/
         try {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", tshirt_tab);
         }
       catch(Exception e){
          wait.until( ExpectedConditions.elementToBeClickable(tshirt_tab);
          tshirt_tab.click();
       }
       // tshirt_tab.click();
    }

    public void click_signin(){
        signInButton.click();
    }


}
