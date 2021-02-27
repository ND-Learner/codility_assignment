package JourneyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {

    public OrderHistoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//table[@id='order-list']/thead//following-sibling::tbody/tr/td/a[1]")
    WebElement previousOrder;

    @FindBy(xpath="//a[@title='Back to orders']")
    WebElement ordersLink;

    public void order_displayed(){

        previousOrder.isDisplayed();
    }

    public void view_orders(){

        previousOrder.isDisplayed();
    }
}
