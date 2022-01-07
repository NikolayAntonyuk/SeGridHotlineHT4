package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement inputLoginName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//span[@class='btn-cell btn-icon btn-facebook']")
    private WebElement buttonFacebook;

    @FindBy(xpath = "//span[@class='btn-cell btn-icon btn-google']")
    private WebElement buttonGoogle;

    @FindBy(xpath = "//p/a[@class='link-blue']")
    private WebElement buttonRegistration;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    private WebElement buttonReCAPTCHA;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }

    public void clickButtonRegistration() {
        buttonRegistration.click();
    }

    public boolean isButtonFacebookVisible() {
        return buttonFacebook.isDisplayed();
    }

    public boolean isButtonGoogleVisible() {
        return buttonGoogle.isDisplayed();
    }

    public boolean isButtonReCAPTCHAVisible() {
        return buttonReCAPTCHA.isDisplayed();
    }

    public void clickReCAPTCHA() {
        buttonReCAPTCHA.click();
    }



}
