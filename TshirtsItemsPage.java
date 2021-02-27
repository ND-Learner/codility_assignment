package JourneyPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsItemsPage {

    WebDriver driver;

    public TshirtsItemsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='button-container']/a/span[text()='Add to cart']")
    WebElement addToCart;

    @FindBy(xpath="//i[@class='icon-ok']")
    WebElement successMessage;

    @FindBy(linkText="Proceed to checkout")
    WebElement proceedToCheckout;

    @FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
    WebElement itemHover;

    public void click_cart(){
        addToCart.click();
    }

    public void hover_item(){
        Actions actions = new Actions(driver);
        actions.moveToElement(itemHover).build().perform();
    }

    public void verify_item_added(){
        String expectedMsg="Product successfully added to your shopping cart";
        String message = successMessage.getText();
        Assert.assertEquals(expectedMsg,message);
        //system.out
    }

    public void click_checkout(){
        proceedToCheckout.click();
    }
}
