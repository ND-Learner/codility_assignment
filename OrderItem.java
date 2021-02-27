package StepDefinition;

import JourneyPages.*;
import Utility.TakeScreenshot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrderItem {

    WebDriver driver;
    MyStoreHomePage home;
    TshirtsItemsPage tshirts;
    SummaryPage summary;
    AddressPage address;
    ShippingPage shipping;
    CheckoutPage checkout;
    PaymentPage payment;
    OrderHistoryPage orderhistory;
    SignInPage signin;

    @Before
    public void startpoint(){
        System.out.println("starting execution.....");
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Given(": User is on My Store Homepage")
    public void user_is_on_my_store_homepage() {
       System.setProperty("webdriver.chrome.driver", "/Users/ndwiv1/IdeaProjects/codilityTest/drivers/chromedriver");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("http://automationpractice.com/index.php");
    }

    @When(": User navigates to T-SHIRTS tab")
    public void user_navigates_to_t_shirts_tab() {

        home = new MyStoreHomePage(driver);
        home.view_tshirts();
    }

    @When(": User select a T-shirt and add to cart")
    public void user_select_a_t_shirt_and_add_to_cart() {

        tshirts = new TshirtsItemsPage(driver);
        tshirts.click_cart();
        tshirts.click_checkout();
    }

    @Then(": User is able to complete the checkout for order")
    public void user_is_able_to_complete_the_checkout_for_order() {

        summary = new SummaryPage(driver);
        summary.click_checkout();
        signin = new SignInPage(driver);
        signin.sign_in();
        address = new AddressPage(driver);
        address.click_checkout();
        shipping = new ShippingPage(driver);
        shipping.agree_terms();
        shipping.click_checkout();
        payment = new PaymentPage(driver);
        payment.select_bank_payment();
        payment.confirm_order();

    }

    @Then(": User can verify their order from Order history")
    public void user_can_verify_their_order_from_order_history() {

        payment = new PaymentPage(driver);
        orderhistory = new OrderHistoryPage(driver);
        payment.click_back_to_orders();
        orderhistory.view_orders();
        orderhistory.order_displayed();
        driver.close();
    }

    @When(": User Login to the website")
    public void user_login_to_the_website() {

        home = new MyStoreHomePage(driver);
        home.click_signin();
        signin = new SignInPage(driver);
        signin.sign_in();
        TakeScreenshot.takeScreenShot(driver, "signin_successful");

    }

    @Then(": User is able to update name from personal Information")
    public void user_is_able_to_update_name_from_personal_information() throws Throwable{
        signin = new SignInPage(driver);
        signin.personal_info_update();
        TakeScreenshot.takeScreenShot(driver, "Information Updated");
        driver.close();
    }


}
