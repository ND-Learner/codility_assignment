package JourneyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

    public ShippingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[@name='processCarrier']")
    WebElement proceedToCheckout;

    @FindBy(xpath="//input[@type='checkbox']")
    WebElement agreeTerms;

    public void click_checkout(){
        proceedToCheckout.click();
    }

    public void agree_terms(){
        agreeTerms.click();
    }
}
