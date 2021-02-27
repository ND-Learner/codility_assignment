package JourneyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='email']")
    WebElement email;

    @FindBy(xpath="//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath="//input[@id='old_passwd']")
    WebElement oldPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signin;

    @FindBy(xpath = "//a[@title='Information']")
    WebElement personalInfo;

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement name;

    @FindBy(xpath="//button[@name='submitIdentity']")
    WebElement save;

    public void sign_in(){
        email.click();
        email.sendKeys("neeludwivedi18@gmail.com");
        password.click();
        password.sendKeys("Lilly@123");
        signin.click();
    }

    public void personal_info_update() throws InterruptedException {
        personalInfo.click();
        name.click();
        name.clear();
        name.sendKeys("NeeluD");
        oldPassword.sendKeys("Lilly@123");
        Thread.sleep(3000);
        save.click();

    }
}
