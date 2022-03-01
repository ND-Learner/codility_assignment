package JourneyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.TakeScreenshot;
import Utility.ExtentReports;

public class PaymentPage {
    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText="Proceed to checkout")
    WebElement proceedToCheckout;

    @FindBy(xpath="//a[@class='bankwire']")
    WebElement payByBankWire;

    @FindBy(xpath="//span[text()='I confirm my order']")
    WebElement confirmOrder;

    @FindBy(xpath="//a[@title='Back to orders']")
    WebElement viewOrder;

    public void click_checkout(){
        proceedToCheckout.click();
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Checkout tile";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void click_back_to_orders(){
        viewOrder.click();
    }

    public void select_bank_payment(){
        payByBankWire.click();
    }

    public void confirm_order(){
        confirmOrder.click();
        TakeScreenshot.takeScreenShot(driver, "Confirmation");

    }
}
