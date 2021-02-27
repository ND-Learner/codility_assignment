package JourneyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

    public SummaryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText="Proceed to checkout")
    WebElement proceedToCheckout;

    public void click_checkout(){
        proceedToCheckout.click();
    }
}
