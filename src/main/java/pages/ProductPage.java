package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'tabs-header__item flex center-xs ')]")
    private List<WebElement> buttonAboutProduct;

    @FindBy(xpath = "//div[@title='Додати товар в особисті списки']")
    private WebElement addToFavorites;

    @FindBy(xpath = "//button[@class='footer__btn btn btn--graphite']")
    private WebElement buttonSaveToFavorites;

    @FindBy(xpath = "//button[@class='footer__btn btn btn--transparent']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//a[@class='footer__btn btn btn--graphite']")
    private WebElement buttonGoToFavorites;

    @FindBy(xpath = "//a[@class='listings-popover__item-link flex-inline' and contains(text(),'Закладки:')]")
    private WebElement buttonFavorites;

    @FindBy(xpath = "//h2[@class='header__title text-x-lg']")
    private WebElement textSpecifications;


    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public boolean isButtonAboutProductVisible() {

        return buttonAboutProduct.get(0).isDisplayed();
    }

    public void clickButtonAboutProduct() {

        buttonAboutProduct.get(0).click();
    }


    public boolean isButtonSaveToFavoritesVisible() {
        return buttonSaveToFavorites.isDisplayed();
    }

    public boolean isButtonContinueVisible() {
        return buttonContinue.isDisplayed();
    }

    public boolean isButtonGoToFavoritesVisible() {
        return buttonGoToFavorites.isDisplayed();
    }

    public void clickButtonGoToFavorites() {
        buttonGoToFavorites.click();
    }

    public void clickAddToFavorites() {
        addToFavorites.click();
    }

    public void clickButtonSaveToFavorites() {
        buttonSaveToFavorites.click();
    }


    public boolean isTextSpecificationsVisible() {
        return textSpecifications.isDisplayed();
    }

}
