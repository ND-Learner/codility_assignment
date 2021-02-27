package JourneyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[@name='processAddress']")
    WebElement proceedToCheckout;

    public void click_checkout(){
        proceedToCheckout.click();
    }
}
